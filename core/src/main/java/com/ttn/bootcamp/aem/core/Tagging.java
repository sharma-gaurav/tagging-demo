package com.ttn.bootcamp.aem.core;

import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.tagging.TagManager;
import org.apache.sling.api.resource.Resource;
import org.apache.sling.api.resource.ResourceResolver;

public class Tagging extends WCMUsePojo {
    private TagManager tagManager;

    @Override
    public void activate() throws Exception {
        ResourceResolver resourceResolver = getResourceResolver();
        tagManager = resourceResolver.adaptTo(TagManager.class);

        Resource resource = resourceResolver.getResource("/content/echo62/home-page");
        System.out.println(tagManager.resolve("/etc/tags/TTN/JVM/spring"));

        System.out.println(tagManager.getTags(resource));
    }


}
