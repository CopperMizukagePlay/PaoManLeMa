package p017c;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import p008b.C0243l;
import p041f.C1511c;
import p102n1.AbstractC2710c;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c.m */
/* loaded from: classes.dex */
public final class C0328m extends AbstractC3784a {

    /* renamed from: u */
    public final C0316a f1139u;

    public C0328m(C0316a c0316a) {
        this.f1139u = c0316a;
    }

    /* renamed from: K */
    public final void m675K(Object obj) {
        C1511c c1511c = this.f1139u.f1112a;
        if (c1511c != null) {
            C0243l c0243l = c1511c.f9998u;
            LinkedHashMap linkedHashMap = c0243l.f940b;
            ArrayList arrayList = c0243l.f942d;
            String str = c1511c.f9999v;
            Object obj2 = linkedHashMap.get(str);
            AbstractC2710c abstractC2710c = c1511c.f10000w;
            if (obj2 != null) {
                int intValue = ((Number) obj2).intValue();
                arrayList.add(str);
                try {
                    c0243l.m518b(intValue, abstractC2710c, obj);
                    return;
                } catch (Exception e7) {
                    arrayList.remove(str);
                    throw e7;
                }
            }
            throw new IllegalStateException(("Attempting to launch an unregistered ActivityResultLauncher with contract " + abstractC2710c + " and input " + obj + ". You must ensure the ActivityResultLauncher is registered before calling launch().").toString());
        }
        throw new IllegalStateException("Launcher has not been initialized");
    }
}
