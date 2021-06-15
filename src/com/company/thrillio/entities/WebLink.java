package com.company.thrillio.entities;

    public class WebLink extends Bookmark {
        private String url;
        private String host;

        private String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }


        public String getHost() {
            return host;
        }

        public void setHost(String host) {
            this.host = host;
        }
        @Override
        public String tpString(){
            return "Weblink [url =" +url +", host=" +host +"]";
        }
    }


