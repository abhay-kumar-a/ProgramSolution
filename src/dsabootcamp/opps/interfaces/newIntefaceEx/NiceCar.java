package dsabootcamp.opps.interfaces.newIntefaceEx;

import dsabootcamp.opps.interfaces.Engine;
import dsabootcamp.opps.interfaces.Media;
public class NiceCar {
        private Engine engine;
        private Media player = new CDPlayer();

        NiceCar(){   /// By default, it calls PowerEngine
                engine = new PowerEngine();
        }
        NiceCar(Engine engine)
        {
                this.engine = engine;   ///  here initialise engine that which engine will be call ( Power of electric)
        }

        void start()
        {
                engine.start();
        }
        void stop()
        {
                engine.stop();
        }
        void startMusic()
        {
                player.start();
        }
        void stopMusic()
        {
                player.stop();
        }
        void UpgradeDefaultEngine()
        {
                this.engine = new ElectricEngine();
        }

}
