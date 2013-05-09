package com.TheYoHanSolo.PTE;

import com.TheYoHanSolo.PTE.lib.Reference;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.PreInit;
import cpw.mods.fml.common.Mod.Init;
import cpw.mods.fml.common.Mod.PostInit;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;

//@Mod initalizes the mod.

@Mod(name = Reference.MOD_NAME,
    modid = Reference.MOD_ID, 
        version = Reference.VERSION)

//client/Server req.

@NetworkMod(clientSideRequired = true, serverSideRequired = false)

//Public Class is where the main stuff is.

public class PeriodicTable 


{
    /*
     * This is the Initialization area where the mod gets initialized.
     */
    //PreInitialization
    @PreInit
    
    public void preInit(FMLPreInitializationEvent event)
    
    {
        
    }
    
    //Initialization
    @Init
    
    public void Init(FMLInitializationEvent event)
    {
        
    }
    
    //PostInitialization
    @PostInit
    
    public void PostInit(FMLPostInitializationEvent event)
    {
        
    }
    

}
