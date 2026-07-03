package p100n;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: n.i */
/* loaded from: classes.dex */
public final class C2650i {

    /* renamed from: a */
    public final C2659l f14326a;

    /* renamed from: b */
    public final int f14327b;

    public C2650i(int i7, C2659l c2659l) {
        this.f14326a = c2659l;
        this.f14327b = i7;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("AnimationResult(endReason=");
        int i7 = this.f14327b;
        if (i7 != 1) {
            if (i7 != 2) {
                str = "null";
            } else {
                str = "Finished";
            }
        } else {
            str = "BoundReached";
        }
        sb.append(str);
        sb.append(", endState=");
        sb.append(this.f14326a);
        sb.append(')');
        return sb.toString();
    }
}
