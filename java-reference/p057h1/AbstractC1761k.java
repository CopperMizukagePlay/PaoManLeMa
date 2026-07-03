package p057h1;

import android.view.RenderNode;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: h1.k */
/* loaded from: classes.dex */
public abstract class AbstractC1761k {
    /* renamed from: a */
    public static int m2890a(RenderNode renderNode) {
        return renderNode.getAmbientShadowColor();
    }

    /* renamed from: b */
    public static int m2891b(RenderNode renderNode) {
        return renderNode.getSpotShadowColor();
    }

    /* renamed from: c */
    public static void m2892c(RenderNode renderNode, int i7) {
        renderNode.setAmbientShadowColor(i7);
    }

    /* renamed from: d */
    public static void m2893d(RenderNode renderNode, int i7) {
        renderNode.setSpotShadowColor(i7);
    }
}
