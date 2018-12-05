package growthcraft.milk.shared;

import growthcraft.milk.shared.processing.churn.user.UserChurnRecipesConfig;

import java.io.File;

public class GrowthcraftMilkUserApis
{
	public final UserChurnRecipesConfig churnRecipes;

	public GrowthcraftMilkUserApis() {
		super();
		this.churnRecipes = new UserChurnRecipesConfig();
//		add(churnRecipes);
	}

	public void setConfigDirectory(File dir) {
		churnRecipes.setConfigFile(dir, "growthcraft/milk/churn_recipes.json");
	}
	
	public void preInit() {
		this.churnRecipes.preInit();
	}
	
	public void register() {
		this.churnRecipes.register();
	}

	public void init() {
		this.churnRecipes.init();
	}

	public void postInit() {
		this.churnRecipes.postInit();
	}

	public void loadConfigs() {
/*		for (IModule module : this)
		{
			if (module instanceof AbstractUserJSONConfig)
			{
				((AbstractUserJSONConfig)module).loadUserConfig();
			}
		}*/
		this.churnRecipes.loadUserConfig();
	}
}
