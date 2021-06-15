package com.company.thrillio;

import com.company.managers.BookmarkManager;
import com.company.managers.UserManager;
import com.company.thrillio.entities.Bookmark;
import com.company.thrillio.entities.User;

import static com.company.thrillio.DataStore.loadData;


public class Launch {

    private static User[] users;
    private static Bookmark[][] bookmarks;
    private static void loadData(){
        System.out.println("1. Loading data...");
        DataStore.loadData();
        users= UserManager.getInstance().getUsers();
        bookmarks= BookmarkManager.getInstance().getBookmarks();
        System.out.println("Printing data...");
        printUserData();
        printBookmarkData();
    }
    private static void printBookmarkData() {
        for(Bookmark [] bookmarkList:bookmarks){
            for (Bookmark bookmark:bookmarkList){
                System.out.println(bookmark);
            }
        } }
    private static void printUserData(){
        for(User user :users){
            System.out.println(user);
        }
    }
    private static void startBookmarking() {
        System.out.println("\n 2.Bookmarking...");
        for(User user:users){
            View.bookmark(user,bookmarks);
        }
    }
    public static void main(String[] args){
        loadData();
        startBookmarking();
    }
    }
