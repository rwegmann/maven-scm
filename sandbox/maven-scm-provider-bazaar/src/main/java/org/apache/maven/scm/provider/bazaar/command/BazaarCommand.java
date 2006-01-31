package org.apache.maven.scm.provider.bazaar.command;

import org.apache.maven.scm.command.Command;

/**
 * Available/Used bazaar commands.
 *
 * These commands does not necessarily correspont to the SCM API.
 * Eg. "check in" is translated to be "commit" and "push".
 *
 * @author <a href="mailto:torbjorn@smorgrav.org">Torbj�rn Eikli Sm�rgrav</a>
 */
public interface BazaarCommand
    extends Command
{
    /** Executable for Bazaar */
    public static final String EXEC = "bzr";

    /** Use to create an empty branch or before importing an existing project */
    public static final String INIT_CMD = "init";

    /** Default recursive. Common option: --dry-run and --no-recursive */
    public static final String ADD_CMD = "add";

    /** Reports the following states: added, removed, modified, unchanged, unknown */
    public static final String STATUS_CMD = "status";

    /** Make a file unversioned */
    public static final String REMOVE_CMD = "remove";

    /** Create a new copy of a branch. Alias get or clone */
    public static final String BRANCH_CMD = "branch";

    /** Commit changes into a new revision */
    public static final String COMMIT_CMD = "commit";

    /** Pull any changes from another branch into the current one */
    public static final String PULL_CMD = "pull";

    /** Show log of this branch Common option: --revision */
    public static final String LOG_CMD = "log";

    /** Show differences in workingtree. Common option: --revision */
    public static final String DIFF_CMD = "diff";

    /** Push this branch into another branch */
    public static final String PUSH_CMD = "push";

    /** Show current revision number */
    public static final String REVNO_CMD = "revno";

    /** Show inventory of the current working copy or a revision */
    public static final String INVENTORY_CMD = "inventory";

    public static final String NO_RECURSE_OPTION = "--no-recurse";

    public static final String MESSAGE_OPTION = "--message";

    public static final String REVISION_OPTION = "--revision";

    public static final String VERBOSE_OPTION = "--verbose";
}