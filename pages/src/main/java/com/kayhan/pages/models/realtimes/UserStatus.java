/*
 * Copyright (c) 2020.
 * Author: Kayhan Swarup
 * Project: TestLibraries
 */

package com.kayhan.pages.models.realtimes;

import com.kayhan.pages.logs.L;

public class UserStatus {
    private String id;

    private long initializesAt;

    private String referencePath;
    private String status;
    NodeK nodeK;

    public UserStatus() {
    }

    public UserStatus(String id) {
        this.id = id;
    }

    public UserStatus(String id, String referencePath) {
        this.id = id;
        this.referencePath = referencePath;
    }

    public UserStatus(NodeK nodeK){
        this.nodeK = nodeK;
        if(nodeK.getReferencePath()!=null){
            referencePath=nodeK.getReferencePath();
            generate();
        }
    }



    private void generate() {
        generateID();

    }

    private void generateCollection(int level) {
        int []  index = new int[level];
        for(int i =0,j=0;i<referencePath.length();i++){
            if(referencePath.charAt(i)=='/'){
                try {
                    index[j++] = i;
                } catch (Exception e) {
                    L.e(e);
                }
            }
        }
    }

    private void generateID() {
        int index = -1;
        for(int i =0;i<referencePath.length();i++){
            if(referencePath.charAt(i) == '/'){
                index = i;
            }
        }
        if(index>=0&&index<referencePath.length()-1){
            id = referencePath.substring(index+1);
            if(index>=2){
                generateCollection(index);
            }

        }


    }
}
