package ma.tinyurl.core;

import java.util.HashMap;

public class TinyUrl {
    private HashMap<String, String> urls = new HashMap<>();

    public String encode(String url){
        String tinyUrl;
        tinyUrl = "www.tinyurl.ma/";
        String uniqueKey = Integer.toHexString(url.hashCode());
        tinyUrl += uniqueKey;
        urls.put(tinyUrl, url);
        return  tinyUrl;
    }

    public  String decode(String tinyurl){
        String notFound = "Your tiny url is not found";
        String url = urls.get(tinyurl);
        if (url == null){
            return  notFound;
        }
        else
            return url;
    }
}
