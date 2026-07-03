package p117p1;

import java.util.ArrayList;
import p027d1.C0464b;
import p060h5.C1813u;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: p1.s */
/* loaded from: classes.dex */
public final class C2868s {

    /* renamed from: a */
    public final long f15006a;

    /* renamed from: b */
    public final long f15007b;

    /* renamed from: c */
    public final long f15008c;

    /* renamed from: d */
    public final boolean f15009d;

    /* renamed from: e */
    public final float f15010e;

    /* renamed from: f */
    public final long f15011f;

    /* renamed from: g */
    public final long f15012g;

    /* renamed from: h */
    public final boolean f15013h;

    /* renamed from: i */
    public final int f15014i;

    /* renamed from: j */
    public final long f15015j;

    /* renamed from: k */
    public final ArrayList f15016k;

    /* renamed from: l */
    public final long f15017l;

    /* renamed from: m */
    public boolean f15018m;

    /* renamed from: n */
    public boolean f15019n;

    /* renamed from: o */
    public C2868s f15020o;

    public C2868s(long j6, long j7, long j8, boolean z7, float f7, long j9, long j10, boolean z8, boolean z9, int i7, long j11) {
        this.f15006a = j6;
        this.f15007b = j7;
        this.f15008c = j8;
        this.f15009d = z7;
        this.f15010e = f7;
        this.f15011f = j9;
        this.f15012g = j10;
        this.f15013h = z8;
        this.f15014i = i7;
        this.f15015j = j11;
        this.f15017l = 0L;
        this.f15018m = z9;
        this.f15019n = z9;
    }

    /* renamed from: a */
    public final void m4550a() {
        C2868s c2868s = this.f15020o;
        if (c2868s == null) {
            this.f15018m = true;
            this.f15019n = true;
        } else if (c2868s != null) {
            c2868s.m4550a();
        }
    }

    /* renamed from: b */
    public final boolean m4551b() {
        C2868s c2868s = this.f15020o;
        if (c2868s != null) {
            return c2868s.m4551b();
        }
        if (!this.f15018m && !this.f15019n) {
            return false;
        }
        return true;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("PointerInputChange(id=");
        sb.append((Object) C2867r.m4549b(this.f15006a));
        sb.append(", uptimeMillis=");
        sb.append(this.f15007b);
        sb.append(", position=");
        sb.append((Object) C0464b.m1013i(this.f15008c));
        sb.append(", pressed=");
        sb.append(this.f15009d);
        sb.append(", pressure=");
        sb.append(this.f15010e);
        sb.append(", previousUptimeMillis=");
        sb.append(this.f15011f);
        sb.append(", previousPosition=");
        sb.append((Object) C0464b.m1013i(this.f15012g));
        sb.append(", previousPressed=");
        sb.append(this.f15013h);
        sb.append(", isConsumed=");
        sb.append(m4551b());
        sb.append(", type=");
        int i7 = this.f15014i;
        if (i7 != 1) {
            if (i7 != 2) {
                if (i7 != 3) {
                    if (i7 != 4) {
                        str = "Unknown";
                    } else {
                        str = "Eraser";
                    }
                } else {
                    str = "Stylus";
                }
            } else {
                str = "Mouse";
            }
        } else {
            str = "Touch";
        }
        sb.append((Object) str);
        sb.append(", historical=");
        Object obj = this.f15016k;
        if (obj == null) {
            obj = C1813u.f10860e;
        }
        sb.append(obj);
        sb.append(",scrollDelta=");
        sb.append((Object) C0464b.m1013i(this.f15015j));
        sb.append(')');
        return sb.toString();
    }

    public C2868s(long j6, long j7, long j8, boolean z7, float f7, long j9, long j10, boolean z8, int i7, ArrayList arrayList, long j11, long j12) {
        this(j6, j7, j8, z7, f7, j9, j10, z8, false, i7, j11);
        this.f15016k = arrayList;
        this.f15017l = j12;
    }
}
