package de.exocronsolutions.malik.server;

import de.exocronsolutions.malik.core.twitter.BlockList;
import de.exocronsolutions.malik.server.blocklist.BlockListRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
@RestController
public class MalikRestController {

    private final BlockListRepository blockListRepository;

    @Autowired
    public MalikRestController(BlockListRepository blockListRepository) {
        this.blockListRepository = blockListRepository;
    }

    @RequestMapping(method = RequestMethod.GET, path = "/twitter/blocklist")
    public BlockList getBlockList() {
        return blockListRepository.find();
    }
}
