package p099m6;

import java.util.concurrent.TimeUnit;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: m6.d */
/* loaded from: classes.dex */
public final class C2597d {

    /* renamed from: n */
    public static final /* synthetic */ int f14042n = 0;

    /* renamed from: a */
    public final boolean f14043a;

    /* renamed from: b */
    public final boolean f14044b;

    /* renamed from: c */
    public final int f14045c;

    /* renamed from: d */
    public final int f14046d;

    /* renamed from: e */
    public final boolean f14047e;

    /* renamed from: f */
    public final boolean f14048f;

    /* renamed from: g */
    public final boolean f14049g;

    /* renamed from: h */
    public final int f14050h;

    /* renamed from: i */
    public final int f14051i;

    /* renamed from: j */
    public final boolean f14052j;

    /* renamed from: k */
    public final boolean f14053k;

    /* renamed from: l */
    public final boolean f14054l;

    /* renamed from: m */
    public String f14055m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        AbstractC3367j.m5100e(timeUnit, "timeUnit");
        timeUnit.toSeconds(Integer.MAX_VALUE);
    }

    public C2597d(boolean z7, boolean z8, int i7, int i8, boolean z9, boolean z10, boolean z11, int i9, int i10, boolean z12, boolean z13, boolean z14, String str) {
        this.f14043a = z7;
        this.f14044b = z8;
        this.f14045c = i7;
        this.f14046d = i8;
        this.f14047e = z9;
        this.f14048f = z10;
        this.f14049g = z11;
        this.f14050h = i9;
        this.f14051i = i10;
        this.f14052j = z12;
        this.f14053k = z13;
        this.f14054l = z14;
        this.f14055m = str;
    }

    public final String toString() {
        String str = this.f14055m;
        if (str == null) {
            StringBuilder sb = new StringBuilder();
            if (this.f14043a) {
                sb.append("no-cache, ");
            }
            if (this.f14044b) {
                sb.append("no-store, ");
            }
            int i7 = this.f14045c;
            if (i7 != -1) {
                sb.append("max-age=");
                sb.append(i7);
                sb.append(", ");
            }
            int i8 = this.f14046d;
            if (i8 != -1) {
                sb.append("s-maxage=");
                sb.append(i8);
                sb.append(", ");
            }
            if (this.f14047e) {
                sb.append("private, ");
            }
            if (this.f14048f) {
                sb.append("public, ");
            }
            if (this.f14049g) {
                sb.append("must-revalidate, ");
            }
            int i9 = this.f14050h;
            if (i9 != -1) {
                sb.append("max-stale=");
                sb.append(i9);
                sb.append(", ");
            }
            int i10 = this.f14051i;
            if (i10 != -1) {
                sb.append("min-fresh=");
                sb.append(i10);
                sb.append(", ");
            }
            if (this.f14052j) {
                sb.append("only-if-cached, ");
            }
            if (this.f14053k) {
                sb.append("no-transform, ");
            }
            if (this.f14054l) {
                sb.append("immutable, ");
            }
            if (sb.length() == 0) {
                return "";
            }
            sb.delete(sb.length() - 2, sb.length());
            String sb2 = sb.toString();
            AbstractC3367j.m5099d(sb2, "StringBuilder().apply(builderAction).toString()");
            this.f14055m = sb2;
            return sb2;
        }
        return str;
    }
}
