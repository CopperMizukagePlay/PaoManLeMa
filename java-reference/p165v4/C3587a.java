package p165v4;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: v4.a */
/* loaded from: classes.dex */
public final class C3587a {

    /* renamed from: a */
    public final /* synthetic */ int f17225a;

    /* renamed from: b */
    public final int f17226b;

    /* renamed from: c */
    public final int f17227c;

    /* renamed from: d */
    public final int f17228d;

    /* renamed from: e */
    public final int f17229e;

    /* renamed from: f */
    public int f17230f;

    public C3587a(int i7, int i8, int i9, int i10, int i11) {
        this.f17225a = i11;
        switch (i11) {
            case 1:
                this.f17230f = -1;
                this.f17226b = i7;
                this.f17227c = i8;
                this.f17228d = i9;
                this.f17229e = i10;
                return;
            default:
                this.f17226b = i7;
                this.f17227c = i10;
                this.f17228d = i8;
                this.f17229e = i9;
                this.f17230f = i8 + i9;
                return;
        }
    }

    /* renamed from: a */
    public boolean m5577a(int i7) {
        if (i7 != -1) {
            if (this.f17228d == (i7 % 3) * 3) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: b */
    public void m5578b() {
        this.f17230f = (this.f17228d / 3) + ((this.f17229e / 30) * 3);
    }

    public String toString() {
        switch (this.f17225a) {
            case 1:
                return this.f17230f + "|" + this.f17229e;
            default:
                return super.toString();
        }
    }
}
