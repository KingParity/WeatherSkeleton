package com.william.weatherskeleton.proxy;

public interface IProxy
{
    default void preInit() {}

    default void init() {}
}
