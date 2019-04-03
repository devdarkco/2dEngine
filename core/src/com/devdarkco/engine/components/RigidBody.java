package com.devdarkco.engine.components;

import com.badlogic.gdx.physics.box2d.Body;
import com.badlogic.gdx.physics.box2d.BodyDef;
import com.badlogic.gdx.physics.box2d.Box2DDebugRenderer;
import com.badlogic.gdx.physics.box2d.PolygonShape;
import com.devdarkco.engine.Engine;

public class RigidBody extends Component {

    public Box2DDebugRenderer debugRenderer = new Box2DDebugRenderer();

    public Body createBody(BodyDef.BodyType type, float x, float y, boolean fixedRotation) {
        Body gObj;
        BodyDef bodyDef = new BodyDef();
        bodyDef.type = type;
        bodyDef.position.set(x, y);
        bodyDef.fixedRotation = fixedRotation;
        gObj = Engine.getWorld().createBody(bodyDef);

        PolygonShape shape = new PolygonShape();
        shape.setAsBox(50, 50);
        gObj.createFixture(shape, 1f);
        return gObj;
    }
}
