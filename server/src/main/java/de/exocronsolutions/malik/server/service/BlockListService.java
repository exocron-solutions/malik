package de.exocronsolutions.malik.server.service;

import de.exocronsolutions.malik.core.twitter.BlockList;
import de.exocronsolutions.malik.server.blocklist.BlockListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
@Service
public class BlockListService {

    private final BlockListRepository blockListRepository;

    @Autowired
    public BlockListService(BlockListRepository blockListRepository) {
        this.blockListRepository = blockListRepository;
    }

    public BlockList getBlockList() {
        return blockListRepository.find();
    }
}
