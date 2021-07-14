    //package com.izx.myapplication.java.solid.srp;
     
    class Order {
        void calculateTotalSum() {
        }
     
        void getItems() {
        }
     
        void getItemCount() {
        }
     
        void addItem(Item item) {
     
        }
     
        void deleteItem(Item item) {
        }
    }
     
    class Item {
     
    }
     
    class OrderHistory {
        void getDailyHistory() {}
        void getMonthlyHistory() {}
    }
     
    class OrderViewer {
        void printOrder(Order order) {
        }
     
        void showOrder(Order order) {
        }
    }
     
    class Main {
        public static void main(String[] args) {
            Item item = new Item();
            Order order = new Order();
            order.addItem(item);
            OrderHistory history = new OrderHistory();
            history.getDailyHistory();
            OrderViewer viewer = new OrderViewer();
            viewer.printOrder(order);
        }
    }