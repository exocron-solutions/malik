package de.exocronsolutions.malik.core;

import de.exocronsolutions.malik.core.twitter.BlockList;
import twitter4j.*;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class MalikCoreImpl implements MalikCore {

    private Twitter twitter;

    public MalikCoreImpl() {
        boolean exists = Files.exists(Paths.get("twitter4j.properties"));
        if (!exists) {
            throw new IllegalStateException("Could not found twitter4j.properties");
        }

        twitter = TwitterFactory.getSingleton();
    }

    @Override
    public BlockList getBlockList() {
        if (twitter == null) {
            return new BlockList(new String[]{"Not connected."});
        }

        PagableResponseList<User> blocksList = null;

        try {
            blocksList = twitter.getBlocksList();
        } catch (TwitterException e) {
            e.printStackTrace();
        }

        if (blocksList == null) {
            return new BlockList(new String[]{"Error fetching block list."});
        }

        return new BlockList(blocksList.stream().map(User::getName).toArray(String[]::new));
    }
}
