package com.example.yixuan.challenjour;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Yixuan on 2/25/2017.
 */

public class record {
    int score;
    Map<String, Double> metrics;
    String name, graphicName;
    String info, moreInfo;

    public record(){
        score = 0;
        name = graphicName = info = moreInfo = "";
        metrics = new HashMap<String, Double>();
    }
    public record(String name, String graphicName){
        this.name = name;
        this.graphicName = graphicName;
        score = 0;
        metrics = new HashMap<String, Double>();
    }
    public record(int score, String name, String graphicName){
        this.name = name;
        this.graphicName = graphicName;
        this.score = score;
    }
    public Map<String, Double> getMetrics(){
        return metrics;
    }
    public int getScore(){
        return score;
    }
    public String getName(){
        return name;
    }
    public String getGraphicName(){
        return graphicName;
    }
    public String getMoreInfo(){
        return moreInfo;
    }
    public String getInfo(){
        return info;
    }
    public void setGraphicName(String x){
        graphicName = x;
    }
    public void setName(String x){
        name = x;
    }
    public void setMoreInfo(String x){
        moreInfo = x;
    }
    public void setScore(int x){
        score = x;
    }
    public void setInfo(String x){
        info = x;
    }
    public void setMetrics(Map<String,Double> metrics){
        this.metrics = metrics;
    }
    public void addToDict(String s, Double d){
        metrics.put(s,d);
    }
}
