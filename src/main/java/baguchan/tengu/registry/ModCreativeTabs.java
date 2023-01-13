package baguchan.tengu.registry;

import baguchan.tengu.TenguCore;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.event.CreativeModeTabEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(bus = Mod.EventBusSubscriber.Bus.MOD, modid = TenguCore.MODID)
public class ModCreativeTabs {
	@SubscribeEvent
	public static void addCreativeTab(CreativeModeTabEvent.BuildContents event){
		if(event.getTab() == CreativeModeTabs.SPAWN_EGGS) {
			event.accept(TenguItemRegistry.TENGU_SPAWNEGG.get());
		}
	}
}