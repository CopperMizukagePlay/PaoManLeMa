package p170w1;

import java.text.BreakIterator;
import p050g2.C1598l0;
import p132r2.EnumC3036j;
import p149t4.AbstractC3269f;
import p158u5.AbstractC3367j;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: w1.b */
/* loaded from: classes.dex */
public final class C3656b extends AbstractC3269f {

    /* renamed from: e */
    public static C3656b f17483e;

    /* renamed from: f */
    public static C3656b f17484f;

    /* renamed from: g */
    public static C3656b f17485g;

    /* renamed from: h */
    public static final EnumC3036j f17486h = EnumC3036j.f15601f;

    /* renamed from: i */
    public static final EnumC3036j f17487i = EnumC3036j.f15600e;

    /* renamed from: c */
    public final /* synthetic */ int f17488c;

    /* renamed from: d */
    public Object f17489d;

    @Override // p149t4.AbstractC3269f
    /* renamed from: a */
    public final int[] mo4982a(int i7) {
        int i8;
        switch (this.f17488c) {
            case 0:
                int length = m4984c().length();
                if (length <= 0 || i7 >= length) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f17489d;
                    if (breakIterator != null) {
                        if (!breakIterator.isBoundary(i7)) {
                            BreakIterator breakIterator2 = (BreakIterator) this.f17489d;
                            if (breakIterator2 != null) {
                                i7 = breakIterator2.following(i7);
                            } else {
                                AbstractC3367j.m5105j("impl");
                                throw null;
                            }
                        } else {
                            BreakIterator breakIterator3 = (BreakIterator) this.f17489d;
                            if (breakIterator3 != null) {
                                int following = breakIterator3.following(i7);
                                if (following == -1) {
                                    return null;
                                }
                                return m4983b(i7, following);
                            }
                            AbstractC3367j.m5105j("impl");
                            throw null;
                        }
                    } else {
                        AbstractC3367j.m5105j("impl");
                        throw null;
                    }
                } while (i7 != -1);
                return null;
            case 1:
                if (m4984c().length() <= 0 || i7 >= m4984c().length()) {
                    return null;
                }
                if (i7 < 0) {
                    i7 = 0;
                }
                while (!m5659i(i7) && (!m5659i(i7) || (i7 != 0 && m5659i(i7 - 1)))) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f17489d;
                    if (breakIterator4 != null) {
                        i7 = breakIterator4.following(i7);
                        if (i7 == -1) {
                            return null;
                        }
                    } else {
                        AbstractC3367j.m5105j("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f17489d;
                if (breakIterator5 != null) {
                    int following2 = breakIterator5.following(i7);
                    if (following2 == -1 || !m5658h(following2)) {
                        return null;
                    }
                    return m4983b(i7, following2);
                }
                AbstractC3367j.m5105j("impl");
                throw null;
            default:
                if (m4984c().length() <= 0 || i7 >= m4984c().length()) {
                    return null;
                }
                EnumC3036j enumC3036j = f17486h;
                if (i7 < 0) {
                    C1598l0 c1598l0 = (C1598l0) this.f17489d;
                    if (c1598l0 != null) {
                        i8 = c1598l0.m2578e(0);
                    } else {
                        AbstractC3367j.m5105j("layoutResult");
                        throw null;
                    }
                } else {
                    C1598l0 c1598l02 = (C1598l0) this.f17489d;
                    if (c1598l02 != null) {
                        int m2578e = c1598l02.m2578e(i7);
                        if (m5656f(m2578e, enumC3036j) == i7) {
                            i8 = m2578e;
                        } else {
                            i8 = m2578e + 1;
                        }
                    } else {
                        AbstractC3367j.m5105j("layoutResult");
                        throw null;
                    }
                }
                C1598l0 c1598l03 = (C1598l0) this.f17489d;
                if (c1598l03 != null) {
                    if (i8 >= c1598l03.f10289b.f10317f) {
                        return null;
                    }
                    return m4983b(m5656f(i8, enumC3036j), m5656f(i8, f17487i) + 1);
                }
                AbstractC3367j.m5105j("layoutResult");
                throw null;
        }
    }

    @Override // p149t4.AbstractC3269f
    /* renamed from: e */
    public final int[] mo4985e(int i7) {
        int i8;
        switch (this.f17488c) {
            case 0:
                int length = m4984c().length();
                if (length <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length) {
                    i7 = length;
                }
                do {
                    BreakIterator breakIterator = (BreakIterator) this.f17489d;
                    if (breakIterator != null) {
                        if (!breakIterator.isBoundary(i7)) {
                            BreakIterator breakIterator2 = (BreakIterator) this.f17489d;
                            if (breakIterator2 != null) {
                                i7 = breakIterator2.preceding(i7);
                            } else {
                                AbstractC3367j.m5105j("impl");
                                throw null;
                            }
                        } else {
                            BreakIterator breakIterator3 = (BreakIterator) this.f17489d;
                            if (breakIterator3 != null) {
                                int preceding = breakIterator3.preceding(i7);
                                if (preceding == -1) {
                                    return null;
                                }
                                return m4983b(preceding, i7);
                            }
                            AbstractC3367j.m5105j("impl");
                            throw null;
                        }
                    } else {
                        AbstractC3367j.m5105j("impl");
                        throw null;
                    }
                } while (i7 != -1);
                return null;
            case 1:
                int length2 = m4984c().length();
                if (length2 <= 0 || i7 <= 0) {
                    return null;
                }
                if (i7 > length2) {
                    i7 = length2;
                }
                while (i7 > 0 && !m5659i(i7 - 1) && !m5658h(i7)) {
                    BreakIterator breakIterator4 = (BreakIterator) this.f17489d;
                    if (breakIterator4 != null) {
                        i7 = breakIterator4.preceding(i7);
                        if (i7 == -1) {
                            return null;
                        }
                    } else {
                        AbstractC3367j.m5105j("impl");
                        throw null;
                    }
                }
                BreakIterator breakIterator5 = (BreakIterator) this.f17489d;
                if (breakIterator5 != null) {
                    int preceding2 = breakIterator5.preceding(i7);
                    if (preceding2 == -1 || !m5659i(preceding2)) {
                        return null;
                    }
                    if (preceding2 != 0 && m5659i(preceding2 - 1)) {
                        return null;
                    }
                    return m4983b(preceding2, i7);
                }
                AbstractC3367j.m5105j("impl");
                throw null;
            default:
                if (m4984c().length() <= 0 || i7 <= 0) {
                    return null;
                }
                int length3 = m4984c().length();
                EnumC3036j enumC3036j = f17487i;
                if (i7 > length3) {
                    C1598l0 c1598l0 = (C1598l0) this.f17489d;
                    if (c1598l0 != null) {
                        i8 = c1598l0.m2578e(m4984c().length());
                    } else {
                        AbstractC3367j.m5105j("layoutResult");
                        throw null;
                    }
                } else {
                    C1598l0 c1598l02 = (C1598l0) this.f17489d;
                    if (c1598l02 != null) {
                        int m2578e = c1598l02.m2578e(i7);
                        if (m5656f(m2578e, enumC3036j) + 1 == i7) {
                            i8 = m2578e;
                        } else {
                            i8 = m2578e - 1;
                        }
                    } else {
                        AbstractC3367j.m5105j("layoutResult");
                        throw null;
                    }
                }
                if (i8 < 0) {
                    return null;
                }
                return m4983b(m5656f(i8, f17486h), m5656f(i8, enumC3036j) + 1);
        }
    }

    /* renamed from: f */
    public int m5656f(int i7, EnumC3036j enumC3036j) {
        C1598l0 c1598l0 = (C1598l0) this.f17489d;
        if (c1598l0 != null) {
            int m2581h = c1598l0.m2581h(i7);
            C1598l0 c1598l02 = (C1598l0) this.f17489d;
            if (c1598l02 != null) {
                if (enumC3036j != c1598l02.m2582i(m2581h)) {
                    C1598l0 c1598l03 = (C1598l0) this.f17489d;
                    if (c1598l03 != null) {
                        return c1598l03.m2581h(i7);
                    }
                    AbstractC3367j.m5105j("layoutResult");
                    throw null;
                }
                if (((C1598l0) this.f17489d) != null) {
                    return r6.m2577d(i7, false) - 1;
                }
                AbstractC3367j.m5105j("layoutResult");
                throw null;
            }
            AbstractC3367j.m5105j("layoutResult");
            throw null;
        }
        AbstractC3367j.m5105j("layoutResult");
        throw null;
    }

    /* renamed from: g */
    public void m5657g(String str) {
        switch (this.f17488c) {
            case 0:
                this.f16115a = str;
                BreakIterator breakIterator = (BreakIterator) this.f17489d;
                if (breakIterator != null) {
                    breakIterator.setText(str);
                    return;
                } else {
                    AbstractC3367j.m5105j("impl");
                    throw null;
                }
            default:
                this.f16115a = str;
                BreakIterator breakIterator2 = (BreakIterator) this.f17489d;
                if (breakIterator2 != null) {
                    breakIterator2.setText(str);
                    return;
                } else {
                    AbstractC3367j.m5105j("impl");
                    throw null;
                }
        }
    }

    /* renamed from: h */
    public boolean m5658h(int i7) {
        if (i7 > 0 && m5659i(i7 - 1)) {
            if (i7 == m4984c().length() || !m5659i(i7)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m5659i(int i7) {
        if (i7 >= 0 && i7 < m4984c().length()) {
            return Character.isLetterOrDigit(m4984c().codePointAt(i7));
        }
        return false;
    }
}
