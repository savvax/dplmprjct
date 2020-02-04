package com.ifmojava.dplmprjct;

import java.util.List;

public class Burse {
    public List<Data> data;
    Status status;

    @Override
    public String toString() {
        return "Данные по валюте: " +
                status +
                data;
    }

    private class Status {
        String timestamp;

        @Override
        public String toString() {
            return "Время запроса: " + timestamp + "; ";
        }
    }
    private class Data {
        String name;

        @Override
        public String toString() {
            return "Название: " + name + "; " + quote;
        }

        public Quote quote;


        private class Quote {
            public USD USD;

            @Override
            public String toString() {
                return "Цена (В долларах): " + USD;
            }

            class USD {
                String price;

                @Override
                public String toString() {
                    return  price;
                }
            }
        }
    }
}