package p162v1;

import p019c1.InterfaceC0369m;
import p092m.AbstractC2487d;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v1.g */
/* loaded from: classes.dex */
public final class C3501g implements InterfaceC0369m {

    /* renamed from: a */
    public static final C3501g f16859a = new Object();

    /* renamed from: b */
    public static Boolean f16860b;

    @Override // p019c1.InterfaceC0369m
    /* renamed from: c */
    public final boolean mo840c() {
        Boolean bool = f16860b;
        if (bool != null) {
            return bool.booleanValue();
        }
        throw AbstractC2487d.m4041e("canFocus is read before it is written");
    }

    @Override // p019c1.InterfaceC0369m
    /* renamed from: d */
    public final void mo841d(boolean z7) {
        f16860b = Boolean.valueOf(z7);
    }
}
