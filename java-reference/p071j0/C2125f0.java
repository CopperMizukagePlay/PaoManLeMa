package p071j0;

import java.util.LinkedHashMap;
import p001a0.C0068q2;
import p054g6.InterfaceC1702d;
import p137s.C3081j;
import p137s.InterfaceC3080i;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: j0.f0 */
/* loaded from: classes.dex */
public final class C2125f0 implements InterfaceC3080i {

    /* renamed from: a */
    public final long f12425a;

    /* renamed from: b */
    public final LinkedHashMap f12426b = new LinkedHashMap();

    /* renamed from: c */
    public final C0068q2 f12427c;

    public C2125f0(C3081j c3081j, long j6) {
        this.f12425a = j6;
        this.f12427c = new C0068q2(12, c3081j.f15679a, this);
    }

    @Override // p137s.InterfaceC3080i
    /* renamed from: a */
    public final InterfaceC1702d mo3477a() {
        return this.f12427c;
    }
}
