package org.myProject.Services;

public interface ServiceCUD<T> {
    public abstract void create(T t);
    public abstract void update(T t);
    public abstract void delete(T t);
}


