package com.cisco.vertex;

import io.vertx.core.AbstractVerticle;
import io.vertx.core.AsyncResult;
import io.vertx.core.Future;
import io.vertx.core.Handler;
import io.vertx.core.Vertx;
import io.vertx.core.VertxOptions;

public class Publisher extends AbstractVerticle{

	@Override
	public void start(Future<Void> startFuture)
	{
		
		System.out.println("My Verticle Started :First");
		vertx.eventBus().publish("Channel1","message 2");
	}
	
	@Override
	public void stop(Future<Void> stopFuture) throws Exception
	{
		System.out.println("My Vertex stopped :");
	}

}
