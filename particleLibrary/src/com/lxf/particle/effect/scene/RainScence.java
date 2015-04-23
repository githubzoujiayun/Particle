package com.lxf.particle.effect.scene;

import com.lxf.particle.effect.base.EffectScence;
import com.lxf.particle.effect.item.RainPoint;

public class RainScence extends EffectScence{

	/**
	 * 雨景构造
	 * @param rainNum	雨点数量
	 * @param width		雨点显示屏幕宽
	 * @param height	雨点显示屏幕高
	 */
	public RainScence(int width, int height, int rainNum){
		super(width, height,rainNum);
	}

	@Override
	protected void initScence() {
		for(int i = 0; i < itemNum; i ++){
			list.add(new RainPoint(width, height));
		}		
	}
	
}