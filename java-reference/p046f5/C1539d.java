package p046f5;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: f5.d */
/* loaded from: classes.dex */
public final class C1539d extends AbstractC1540e {

    /* renamed from: a */
    public final EnumC1536a f10112a;

    /* renamed from: b */
    public final String f10113b;

    /* renamed from: c */
    public final String f10114c;

    /* renamed from: d */
    public final long f10115d;

    public C1539d(EnumC1536a enumC1536a) {
        this.f10112a = enumC1536a;
        this.f10113b = enumC1536a.f10103e;
        this.f10114c = enumC1536a.f10104f;
        this.f10115d = enumC1536a.f10107i;
    }

    @Override // p046f5.AbstractC1540e
    /* renamed from: a */
    public final String mo2471a() {
        return this.f10113b;
    }

    @Override // p046f5.AbstractC1540e
    /* renamed from: b */
    public final long mo2472b(boolean z7) {
        EnumC1536a enumC1536a = this.f10112a;
        if (z7) {
            return enumC1536a.f10106h;
        }
        return enumC1536a.f10105g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C1539d) && this.f10112a == ((C1539d) obj).f10112a) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f10112a.hashCode();
    }

    public final String toString() {
        return "Preset(value=" + this.f10112a + ")";
    }
}
