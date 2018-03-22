package de.exocronsolutions.malik.core.twitter;

/**
 * @author Felix Klauke <info@felix-klauke.de>
 */
public class BlockList {

    private final long createdAt = System.currentTimeMillis();
    private final String[] blockedUsers;

    public BlockList(String[] blockedUsers) {
        this.blockedUsers = blockedUsers;
    }

    public String[] getBlockedUsers() {
        return blockedUsers;
    }

    public long getCreatedAt() {
        return createdAt;
    }
}
