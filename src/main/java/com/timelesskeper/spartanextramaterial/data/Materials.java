package com.timelesskeper.spartanextramaterial.data;

import com.oblivioussp.spartanweaponry.api.WeaponMaterial;
import com.timelesskeper.spartanextramaterial.SpartanExtraMaterialMod;
import net.minecraft.util.ResourceLocation;

public class Materials {

    public static WeaponMaterial materialAluminium =
            new WeaponMaterial("aluminium", SpartanExtraMaterialMod.MOD_ID, 0xb8b8b8,0x0, 1, 120, 3.0f, 1.0f,
                    22, new ResourceLocation("forge:ingots/aluminium"));

    public static WeaponMaterial materialOsmium =
            new WeaponMaterial("osmium", SpartanExtraMaterialMod.MOD_ID, 0x85aec9,0x0, 2, 350, 4.0f, 1.5f,
                    12, new ResourceLocation("forge:ingots/osmium"));

    public static WeaponMaterial materialZinc =
            new WeaponMaterial("zinc", SpartanExtraMaterialMod.MOD_ID, 0xd1abab,0x0, 1, 120, 6.0f, 1.0f,
                    22, new ResourceLocation("forge:ingots/zinc"));

    public static WeaponMaterial materialTungsten =
            new WeaponMaterial("tungsten", SpartanExtraMaterialMod.MOD_ID, 0xa7b5ad,0x0, 2, 450, 4.0f, 2.0f,
                    10, new ResourceLocation("forge:ingots/tungsten"));

    public static WeaponMaterial materialTitanium =
            new WeaponMaterial("titanium", SpartanExtraMaterialMod.MOD_ID, 0x9d8e9e,0x0, 2, 450, 4.0f, 2.0f,
                    10, new ResourceLocation("forge:ingots/titanium"));

    public static WeaponMaterial materialCupronickel =
            new WeaponMaterial("cupronickel", SpartanExtraMaterialMod.MOD_ID, 0x42160e,0x0, 2, 500, 3.0f, 1.0f,
                    18, new ResourceLocation("forge:ingots/cupronickel"));

    public static WeaponMaterial materialAluminium_Brass =
            new WeaponMaterial("aluminium_brass", SpartanExtraMaterialMod.MOD_ID, 0xbfb29b,0x0, 2, 450, 6.0f, 1.5f,
                    18, new ResourceLocation("forge:ingots/aluminumbrass"));

    public static WeaponMaterial materialBrass =
            new WeaponMaterial("brass", SpartanExtraMaterialMod.MOD_ID, 0xd9b67c,0x0, 2, 400, 4.0f, 2.0f,
                    10, new ResourceLocation("forge:ingots/brass"));

}
