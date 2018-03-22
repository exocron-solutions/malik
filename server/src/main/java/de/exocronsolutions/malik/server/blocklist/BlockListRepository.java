package de.exocronsolutions.malik.server.blocklist;

import de.exocronsolutions.malik.core.MalikCore;
import de.exocronsolutions.malik.core.twitter.BlockList;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Repository
public class BlockListRepository implements org.springframework.data.repository.Repository<BlockList, Long> {

    private final MalikCore malikCore;

    @Autowired
    public BlockListRepository(MalikCore malikCore) {
        this.malikCore = malikCore;
    }

    public BlockList find() {
        return malikCore.getBlockList();
    }
}
