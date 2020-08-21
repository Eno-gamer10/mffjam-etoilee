package fr.eno.starlight.world.dimension;

import java.util.function.BiFunction;

import fr.eno.starlight.init.InitDimensions;
import net.minecraft.world.World;
import net.minecraft.world.dimension.Dimension;
import net.minecraft.world.dimension.DimensionType;
import net.minecraftforge.common.ModDimension;

public class AstralModDimension extends ModDimension
{	
	public static DimensionType getDimensionType() 
	{
		return InitDimensions.ASTRAL_DIM_TYPE;
	}
	
	@Override
	public BiFunction<World, DimensionType, ? extends Dimension> getFactory() 
	{
		return AstralDimension::new;
	}
}