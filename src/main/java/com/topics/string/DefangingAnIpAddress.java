package com.topics.string;

/*
Given a valid (IPv4) IP address, return a defanged version of that IP address.

A defanged IP address replaces every period "." with "[.]".

Example 1:
Input: address = "1.1.1.1"
Output: "1[.]1[.]1[.]1"

Example 2:
Input: address = "255.100.50.0"
Output: "255[.]100[.]50[.]0"

Constraints:

The given address is a valid IPv4 address.
*/

public class DefangingAnIpAddress {
    /*public String defangIPaddr(String address) {
        return address.replace(".", "[.]");
    }*/

    /*public String defangIPaddr(String address) {
        return String.join("[.]", address.split("\\."));
    }*/

    /*public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]");
    }*/

    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            sb.append(c == '.' ? "[.]" : c);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        String address = "255.100.50.0";
        DefangingAnIpAddress defangingAnIpAddress = new DefangingAnIpAddress();
        System.out.println(defangingAnIpAddress.defangIPaddr(address));
    }
}
