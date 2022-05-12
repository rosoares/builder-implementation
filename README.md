# Implementation of Builder Pattern in Java

This is a repository that implements builder pattern in Java applied to a telecommunications products scenario.

It simulates a ecommerce system that has for while logistics and orders Microservice

## Understanding the Scenario

We have a telecommunications enterprise that provides 4 products: Internet, Pre-paid Phone, Post-paid Phone and Cable TV.
So some products have some attributes in common like Billing and a Client, so we need to build products when a sale reaches to us.

The builder pattern could be applied in this because we have products that have common attributes, but they too have attributes that are used only be themselves.
So one simplest solution was extended a base class named Product and create subclasses to cover the combinations of the attributes. But number of subclasses could be considerable and hierarchy was growing.

So the solution for this problem is to apply Builder Pattern.

You can see the see a little explanation video here: https://www.loom.com/share/d2055cff652a47cfb33298c264c9fa1b


Feel free to fork and do your changes and test scenarios at the Main or Director classes.

