package v0id.vsb.client.model;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * ModelBackpack - Undefined
 * Created using Tabula 7.0.0
 */
public class ModelBackpackUltimate extends ModelBase {
    public ModelRenderer shape1;
    public ModelRenderer shape2;
    public ModelRenderer shape3;
    public ModelRenderer shape4;
    public ModelRenderer shape5;
    public ModelRenderer shape6;
    public ModelRenderer shape7;

    public ModelBackpackUltimate() {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.shape1 = new ModelRenderer(this, 0, 0);
        this.shape1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape1.addBox(-4.0F, -3.0F, -3.0F, 8, 7, 6, 0.0F);
        this.shape5 = new ModelRenderer(this, 0, 23);
        this.shape5.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape5.addBox(-4.0F, 0.0F, -5.0F, 8, 4, 2, 0.0F);
        this.shape7 = new ModelRenderer(this, 28, 12);
        this.shape7.mirror = true;
        this.shape7.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape7.addBox(-8.0F, 0.0F, -2.0F, 2, 3, 5, 0.0F);
        this.shape4 = new ModelRenderer(this, 28, 0);
        this.shape4.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape4.addBox(-6.0F, -4.0F, -2.0F, 2, 7, 5, 0.0F);
        this.shape6 = new ModelRenderer(this, 28, 12);
        this.shape6.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape6.addBox(6.0F, 0.0F, -2.0F, 2, 3, 5, 0.0F);
        this.shape2 = new ModelRenderer(this, 0, 13);
        this.shape2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape2.addBox(-4.0F, -9.0F, -1.0F, 8, 6, 4, 0.0F);
        this.shape3 = new ModelRenderer(this, 28, 0);
        this.shape3.mirror = true;
        this.shape3.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.shape3.addBox(4.0F, -4.0F, -2.0F, 2, 7, 5, 0.0F);
    }

    @Override
    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) { 
        this.shape1.render(f5);
        this.shape5.render(f5);
        this.shape7.render(f5);
        this.shape4.render(f5);
        this.shape6.render(f5);
        this.shape2.render(f5);
        this.shape3.render(f5);
    }

    /**
     * This is a helper function from Tabula to set the rotation of model parts
     */
    public void setRotateAngle(ModelRenderer modelRenderer, float x, float y, float z) {
        modelRenderer.rotateAngleX = x;
        modelRenderer.rotateAngleY = y;
        modelRenderer.rotateAngleZ = z;
    }
}
