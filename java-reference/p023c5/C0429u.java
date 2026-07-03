package p023c5;

import p022c4.C0392b;
import p022c4.C0397g;
import p022c4.C0401k;
import p067i4.C2074g;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c5.u */
/* loaded from: classes.dex */
public final class C0429u extends C0421m {

    /* renamed from: c */
    public boolean f1465c;

    @Override // p023c5.C0421m
    /* renamed from: b */
    public final C0392b mo902b(C0401k c0401k) {
        if (this.f1465c) {
            this.f1465c = false;
            return new C0392b(new C2074g(new C0397g(c0401k)));
        }
        this.f1465c = true;
        return new C0392b(new C2074g(c0401k));
    }
}
