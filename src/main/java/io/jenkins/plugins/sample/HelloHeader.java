package io.jenkins.plugins.sample;

import hudson.Extension;
import jenkins.views.FullHeader;

/**
 * Overrides the navbar of a nectarized jenkins-core, by a custom pageHeader.jelly
 */
@Extension(optional = true, ordinal = Integer.MAX_VALUE)
public class HelloHeader extends FullHeader {
    @Override
    public boolean isEnabled() {
        return true;
    }
}
