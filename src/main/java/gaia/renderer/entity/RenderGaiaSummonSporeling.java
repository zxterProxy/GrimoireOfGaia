package gaia.renderer.entity;

import gaia.GaiaReference;
import net.minecraft.client.Minecraft;
import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.GlStateManager;
import net.minecraft.client.renderer.entity.RenderBiped;
import net.minecraft.client.renderer.entity.RenderManager;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class RenderGaiaSummonSporeling extends RenderBiped<EntityLiving> {

	private static final ResourceLocation texture = new ResourceLocation(GaiaReference.MOD_ID, "textures/models/biped/summon_sporeling.png");
	static RenderManager rend = Minecraft.getMinecraft()
			.getRenderManager();

	public RenderGaiaSummonSporeling(float shadowSize) {
		super(rend, new ModelBiped(), shadowSize);
	}

	@Override
	protected void preRenderCallback(EntityLiving living, float par2) {
		GlStateManager.scale(0.25F, 0.25F, 0.25F);
	}

	@Override
	protected ResourceLocation getEntityTexture(EntityLiving entity) {
		return texture;
	}
}
