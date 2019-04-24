package com.ttn.core;

import com.adobe.cq.sightly.WCMUsePojo;
import com.day.cq.dam.api.Asset;
import com.day.cq.dam.api.Rendition;
import org.apache.sling.api.resource.Resource;

public class ImageRendition extends WCMUsePojo {
    String dimensionImage;
    String image;
    String path;
    @Override
    public void activate() throws Exception {
        dimensionImage=getProperties().get("dimensionImage",String.class);
        image = getProperties().get("image",String.class);
        Resource resource = getResourceResolver().getResource(image);
        Rendition rendition;
        Asset asset = resource.adaptTo(Asset.class);
        rendition = asset.getRendition("cq5dam.thumbnail."+dimensionImage+".png");
        if(rendition!=null){
            path=rendition.getPath();
        }
        else{
            rendition = asset.getRendition("original");
            path = rendition.getPath();
        }

    }
    public String getPath()
    {
        return path;
    }
}
