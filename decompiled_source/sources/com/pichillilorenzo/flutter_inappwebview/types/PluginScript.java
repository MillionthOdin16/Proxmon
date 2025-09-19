package com.pichillilorenzo.flutter_inappwebview.types;

/* loaded from: classes.dex */
public class PluginScript extends UserScript {
    private boolean requiredInAllContentWorlds;

    public PluginScript(String str, String str2, UserScriptInjectionTime userScriptInjectionTime, ContentWorld contentWorld, boolean z) {
        super(str, str2, userScriptInjectionTime, contentWorld);
        this.requiredInAllContentWorlds = z;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.UserScript
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return obj != null && PluginScript.class == obj.getClass() && super.equals(obj) && this.requiredInAllContentWorlds == ((PluginScript) obj).requiredInAllContentWorlds;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.UserScript
    public int hashCode() {
        return (super.hashCode() * 31) + (this.requiredInAllContentWorlds ? 1 : 0);
    }

    public boolean isRequiredInAllContentWorlds() {
        return this.requiredInAllContentWorlds;
    }

    public void setRequiredInAllContentWorlds(boolean z) {
        this.requiredInAllContentWorlds = z;
    }

    @Override // com.pichillilorenzo.flutter_inappwebview.types.UserScript
    public String toString() {
        return "PluginScript{requiredInContentWorld=" + this.requiredInAllContentWorlds + "} " + super.toString();
    }
}
