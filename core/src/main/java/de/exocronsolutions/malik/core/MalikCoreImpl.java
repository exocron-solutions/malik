package de.exocronsolutions.malik.core;

import de.exocronsolutions.malik.core.twitter.BlockList;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class MalikCoreImpl implements MalikCore {

    @Override
    public BlockList getBlockList() {
        return new BlockList(new String[]{"Felix"});
    }
}
