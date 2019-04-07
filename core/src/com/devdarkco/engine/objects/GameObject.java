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

    //Store a random id to the object
    private UUID id;

    //HashMap that contains the GameObject components;
    private static HashMap<Class, HashMap<UUID, ? extends Component>> components = new HashMap<>();

    //Tag to distinguish the GameObject
    private String tag;

    //Default tag if none is assigned
    private static final String DEFAULT = "Default";

    //Reference to hold the Transform component;
    public Transform transform;


    /** Constructs a new GameObject with the give coordinates and tag
     * @param x - initial x value
     * @param y - initial y value
     * @param tag - custom tag
     */
    public GameObject(float x, float y, String tag) {
        //Assign a random UUID
        this.id = UUID.randomUUID();
        //set the tag with the constructor tag
        setTag(tag);
        //add the transform component by default
        addComponent(new Transform());
        //Assign transform reference getting the transform component
        transform = getComponent(Transform.class);
        //set the position with the x and y given by the constructor
        transform.position.set(x, y);
    }

    /** Constructs a new GameObject with the give coordinates.
     * The tag is assigned to default
     * @param x - initial x value
     * @param y - initial y value
     */
    public GameObject(float x, float y){
        this(x, y, DEFAULT);
    }

    /** Constructs a new GameObject at 0, 0 with the default tag;
     */
    public GameObject(){
        this(0, 0, DEFAULT);
    }

    public void render(SpriteBatch batch){
    }

    public void update(float delta){

    }
    
    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTag() {
        return tag;
    }

    /** Adds the component to the list if isnt already in the list
     * @param component - the component to add
     */
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

    /**
     * Get the given component in the components HashMap
     * @param componentClass - .class of the component
     * @return the component stored in the hashMap
     */
    @SuppressWarnings("unchecked")
    public <T> T getComponent(Class<T> componentClass) {
        HashMap<UUID, ? extends Component> store = components.get(componentClass);
        T result = (T) store.get(this.id);
        if (result == null)
            throw new IllegalArgumentException("Get Fail: " + this.id.toString() + " does not posses Component of Class \n missing: " + componentClass);
        return result;
    }

    /**
     * Check if the gameObject have the given component
     * @param componentClass - .class of the component
     * @return true or false if the component is in the component list
     */
    @SuppressWarnings("unchecked")
    public <T> boolean hasComponent(Class<T> componentClass) {
        try {
            HashMap<UUID, ? extends Component> store = components.get(componentClass);
            T result = (T) store.get(this.id);
            if (result == null)
                return false;
            return true;
        } catch (Exception e) {
            return false;
        }
    }
}
