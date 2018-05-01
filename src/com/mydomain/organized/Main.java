package com.mydomain.organized;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {
        TinyUrl testUrl = new TinyUrl();
        String result1 = testUrl.encode("http://git-extensions-documentation.readthedocs.io/en/latest/getting_started.html");
        System.out.println(result1);

        String result2 = testUrl.decode("www.tinyurl.ma/3e5728a6");
        System.out.println(result2);

    }
}
