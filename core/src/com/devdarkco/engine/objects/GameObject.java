package com.devdarkco.engine.objects;

import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Array;
import com.badlogic.gdx.utils.ArrayMap;
import com.devdarkco.engine.components.Component;
import com.devdarkco.engine.components.SpriteRenderer;
import com.devdarkco.engine.components.Transform;

import java.util.HashMap;
import java.util.UUID;

public class GameObject {
    private UUID id;
    private static HashMap<Class, HashMap<UUID, ? extends Component>> components = new HashMap<>();
    private String tag;

    public GameObject() {
        this.id = UUID.randomUUID();
        setTag("Default");
    }

    public void render(SpriteBatch batch){
        if(hasComponent(SpriteRenderer.class)){
            getComponent(SpriteRenderer.class).render = true;
        }
    }

    public void update(float delta){

    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    @SuppressWarnings("unchecked")
    public <T extends Component> void addComponent(T component) {
        synchronized (components) {
            HashMap<UUID, ? extends Component> store = components.get(component.getClass());
            if (store == null) {
                store = new HashMap<UUID, T>();
                components.put(component.getClass(), (HashMap<UUID, ? extends Component>) store);
            }
            ((HashMap<UUID, T>) store).put(this.id, component);
        }
    }

    @SuppressWarnings("unchecked")
    public <T> T getComponent(Class<T> exampleClass) {
        HashMap<UUID, ? extends Component> store = components.get(exampleClass);
        T result = (T) store.get(this.id);
        if (result == null)
            throw new IllegalArgumentException("Get Fail: " + this.id.toString() + " does not posses Component of Class \n missing: " + exampleClass);
        return result;
    }

    @SuppressWarnings("unchecked")
    public <T> boolean hasComponent(Class<T> exampleClass) {
        try {
            HashMap<UUID, ? extends Component> store = components.get(exampleClass);
            T result = (T) store.get(this.id);
            if (result == null)
                return false;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
