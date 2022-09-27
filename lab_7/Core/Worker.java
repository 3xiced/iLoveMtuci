package Core;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

import Core.HrefParser.HrefParser;
import Core.HrefParser.HrefParserSettings;
import Core.Models.URLDepthPair;

public class Worker {

    private HtmlLoader htmlLoader;
    private HrefParser parser;
    private HrefParserSettings settings;

    public Worker(HrefParser parser, HrefParserSettings settings) {
        this.parser = parser;
        this.settings = settings;
        this.htmlLoader = new HtmlLoader(this.settings.getMainUrl());
    }

    public void RunWorker() throws IOException, InterruptedException {

        ArrayList<LinkedList<URLDepthPair>> result = new ArrayList<LinkedList<URLDepthPair>>();
        LinkedList<URLDepthPair> urlChain = new LinkedList<URLDepthPair>();

        String htmlString = htmlLoader.GetHtml();
        String[] links = parser.parse(htmlString);

        for (String link : links) {
            urlChain.add(new URLDepthPair(link, 1));
            for (int i = 0; i < this.settings.getSearchDepth(); i++) {

            }
        }
    }
}
