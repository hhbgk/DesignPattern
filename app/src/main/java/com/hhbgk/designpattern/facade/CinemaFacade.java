package com.hhbgk.designpattern.facade;

/**
 * 外观（Facade）角色：为多个子系统对外提供一个共同的接口
 */
public class CinemaFacade {
    private IController soundSystem;
    private IController projectorSystem;
    private IController centralAirConditioning;

    public CinemaFacade() {
        soundSystem = new SoundSystem();
        projectorSystem = new ProjectorSystem();
        centralAirConditioning = new CentralAirConditioning();
    }

    public void start() {
        soundSystem.on();
        projectorSystem.on();
        centralAirConditioning.on();
    }

    public void stop() {
        soundSystem.off();
        projectorSystem.off();
        centralAirConditioning.off();
    }
}
