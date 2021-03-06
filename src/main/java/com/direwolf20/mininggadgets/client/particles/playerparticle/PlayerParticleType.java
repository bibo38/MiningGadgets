package com.direwolf20.mininggadgets.client.particles.playerparticle;

import net.minecraft.client.particle.IAnimatedSprite;
import net.minecraft.client.particle.IParticleFactory;
import net.minecraft.client.particle.Particle;
import net.minecraft.particles.ParticleType;
import net.minecraft.world.World;

public class PlayerParticleType extends ParticleType<PlayerParticleData> {
    public PlayerParticleType() {
        super(false, PlayerParticleData.DESERIALIZER);
    }

    public static class FACTORY implements IParticleFactory<PlayerParticleData> {
        private final IAnimatedSprite sprites;

        public FACTORY(IAnimatedSprite sprites) {
            this.sprites = sprites;
        }

        @Override
        public Particle makeParticle(PlayerParticleData data, World world, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
            return new PlayerParticle(world, x, y, z, data.targetX, data.targetY, data.targetZ, xSpeed, ySpeed, zSpeed, data.size, data.r, data.g, data.b, data.depthTest, data.maxAgeMul, data.partType, this.sprites);
        }
    }
}
