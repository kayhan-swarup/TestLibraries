/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class NodeK {
    private String referencePath;
    private String collection;
    private ArrayList<String> childrenCollection;
    private String documentID;
    private ArrayList<Attr> attrs=new ArrayList<>();


    public NodeK() {
    }

    public NodeK(String collection, String documentID) {
        this.collection = collection;
        this.documentID = documentID;
    }

    public NodeK(String referencePath) {
        this.referencePath = referencePath;
    }

    public NodeK(String referencePath, Attr... attrs) {
        this.referencePath = referencePath;
        for(Attr attr: attrs){
            this.attrs.add(attr);
        }

    }

    public String getReferencePath() {
        return referencePath;
    }

    public void setReferencePath(String referencePath) {
        this.referencePath = referencePath;
    }

    public String getCollection() {
        return collection;
    }

    public void setCollection(String collection) {
        this.collection = collection;
    }

    public ArrayList<String> getChildrenCollection() {
        return childrenCollection;
    }

    public void setChildrenCollection(ArrayList<String> childrenCollection) {
        this.childrenCollection = childrenCollection;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public ArrayList<Attr> getAttrs() {
        return attrs;
    }

    public void setAttrs(ArrayList<Attr> attrs) {
        this.attrs = attrs;
    }
}
