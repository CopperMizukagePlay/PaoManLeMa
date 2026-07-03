package p050g2;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: g2.x */
/* loaded from: classes.dex */
public final class C1615x {

    /* renamed from: b */
    public static final C1615x f10350b = new C1615x(false);

    /* renamed from: a */
    public final boolean f10351a;

    public C1615x() {
        this.f10351a = false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C1615x) {
            if (this.f10351a == ((C1615x) obj).f10351a) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(0) + (Boolean.hashCode(this.f10351a) * 31);
    }

    public final String toString() {
        return "PlatformParagraphStyle(includeFontPadding=" + this.f10351a + ", emojiSupportMatch=EmojiSupportMatch.Default)";
    }

    public C1615x(boolean z7) {
        this.f10351a = z7;
    }
}
