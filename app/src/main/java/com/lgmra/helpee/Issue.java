package com.lgmra.helpee;


/**
 * Created by ryanalex on 1/2/15.
 */


public class Issue {


    public interface IssueInt {
        void doSomething();
    }


    public Issue() {
    }

    public void postIssue(IssueInt ii) {
        ii.doSomething();

    }
}



