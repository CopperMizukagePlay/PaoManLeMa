package p018c0;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.CancellationSignal;
import android.view.inputmethod.DeleteGesture;
import android.view.inputmethod.DeleteRangeGesture;
import android.view.inputmethod.HandwritingGesture;
import android.view.inputmethod.InsertGesture;
import android.view.inputmethod.JoinOrSplitGesture;
import android.view.inputmethod.PreviewableHandwritingGesture;
import android.view.inputmethod.RemoveSpaceGesture;
import android.view.inputmethod.SelectGesture;
import android.view.inputmethod.SelectRangeGesture;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p001a0.C0043k1;
import p001a0.C0064p2;
import p001a0.EnumC0091x0;
import p024c6.C0439f;
import p027d1.C0464b;
import p027d1.C0465c;
import p034e0.C0622o0;
import p035e1.AbstractC0659i0;
import p050g2.AbstractC1586f0;
import p050g2.C1587g;
import p050g2.C1594j0;
import p050g2.C1596k0;
import p050g2.C1598l0;
import p050g2.C1602n0;
import p050g2.C1605p;
import p060h5.AbstractC1793a0;
import p087l2.C2432a;
import p087l2.C2440e;
import p087l2.C2458v;
import p087l2.InterfaceC2443g;
import p102n1.AbstractC2710c;
import p146t1.InterfaceC3238v;
import p150t5.InterfaceC3279c;
import p158u5.AbstractC3367j;
import p170w1.InterfaceC3679g2;
import p174w5.AbstractC3784a;

/* compiled from: r8-map-id-091eedbcc63bb3784ce17035a64051c23f885688c02fb159d88a8d507f170047 */
/* renamed from: c0.q */
/* loaded from: classes.dex */
public final class C0347q {

    /* renamed from: a */
    public static final C0347q f1167a = new Object();

    /* renamed from: C */
    private final void m753C(C0043k1 c0043k1, SelectGesture selectGesture, C0622o0 c0622o0) {
        RectF selectionArea;
        int granularity;
        if (c0622o0 != null) {
            selectionArea = selectGesture.getSelectionArea();
            C0465c m1396C = AbstractC0659i0.m1396C(selectionArea);
            granularity = selectGesture.getGranularity();
            long m4351y = AbstractC2710c.m4351y(c0043k1, m1396C, m757G(granularity));
            C0043k1 c0043k12 = c0622o0.f2047d;
            if (c0043k12 != null) {
                c0043k12.m122f(m4351y);
            }
            C0043k1 c0043k13 = c0622o0.f2047d;
            if (c0043k13 != null) {
                c0043k13.m121e(C1602n0.f10302b);
            }
            if (!C1602n0.m2586b(m4351y)) {
                c0622o0.m1293p(false);
                c0622o0.m1291n(EnumC0091x0.f416e);
            }
        }
    }

    /* renamed from: D */
    private final void m754D(AbstractC0332b0 abstractC0332b0, SelectGesture selectGesture, AbstractC0330a0 abstractC0330a0) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        AbstractC0659i0.m1396C(selectionArea);
        granularity = selectGesture.getGranularity();
        m757G(granularity);
        throw null;
    }

    /* renamed from: E */
    private final void m755E(C0043k1 c0043k1, SelectRangeGesture selectRangeGesture, C0622o0 c0622o0) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        if (c0622o0 != null) {
            selectionStartArea = selectRangeGesture.getSelectionStartArea();
            C0465c m1396C = AbstractC0659i0.m1396C(selectionStartArea);
            selectionEndArea = selectRangeGesture.getSelectionEndArea();
            C0465c m1396C2 = AbstractC0659i0.m1396C(selectionEndArea);
            granularity = selectRangeGesture.getGranularity();
            long m4331c = AbstractC2710c.m4331c(c0043k1, m1396C, m1396C2, m757G(granularity));
            C0043k1 c0043k12 = c0622o0.f2047d;
            if (c0043k12 != null) {
                c0043k12.m122f(m4331c);
            }
            C0043k1 c0043k13 = c0622o0.f2047d;
            if (c0043k13 != null) {
                c0043k13.m121e(C1602n0.f10302b);
            }
            if (!C1602n0.m2586b(m4331c)) {
                c0622o0.m1293p(false);
                c0622o0.m1291n(EnumC0091x0.f416e);
            }
        }
    }

    /* renamed from: F */
    private final void m756F(AbstractC0332b0 abstractC0332b0, SelectRangeGesture selectRangeGesture, AbstractC0330a0 abstractC0330a0) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        AbstractC0659i0.m1396C(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        AbstractC0659i0.m1396C(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        m757G(granularity);
        throw null;
    }

    /* renamed from: G */
    private final int m757G(int i7) {
        if (i7 == 1) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    private final int m758a(AbstractC0332b0 abstractC0332b0, HandwritingGesture handwritingGesture) {
        throw null;
    }

    /* renamed from: b */
    private final int m759b(HandwritingGesture handwritingGesture, InterfaceC3279c interfaceC3279c) {
        String fallbackText;
        fallbackText = handwritingGesture.getFallbackText();
        if (fallbackText == null) {
            return 3;
        }
        interfaceC3279c.mo23f(new C2432a(fallbackText, 1));
        return 5;
    }

    /* renamed from: c */
    private final int m760c(C0043k1 c0043k1, DeleteGesture deleteGesture, C1587g c1587g, InterfaceC3279c interfaceC3279c) {
        int granularity;
        RectF deletionArea;
        boolean z7;
        granularity = deleteGesture.getGranularity();
        int m757G = m757G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        long m4351y = AbstractC2710c.m4351y(c0043k1, AbstractC0659i0.m1396C(deletionArea), m757G);
        if (C1602n0.m2586b(m4351y)) {
            return f1167a.m759b(AbstractC0344n.m741m(deleteGesture), interfaceC3279c);
        }
        if (m757G == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        m765h(m4351y, c1587g, z7, interfaceC3279c);
        return 1;
    }

    /* renamed from: d */
    private final int m761d(AbstractC0332b0 abstractC0332b0, DeleteGesture deleteGesture, AbstractC0330a0 abstractC0330a0) {
        int granularity;
        RectF deletionArea;
        granularity = deleteGesture.getGranularity();
        m757G(granularity);
        deletionArea = deleteGesture.getDeletionArea();
        AbstractC0659i0.m1396C(deletionArea);
        throw null;
    }

    /* renamed from: e */
    private final int m762e(C0043k1 c0043k1, DeleteRangeGesture deleteRangeGesture, C1587g c1587g, InterfaceC3279c interfaceC3279c) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        boolean z7;
        granularity = deleteRangeGesture.getGranularity();
        int m757G = m757G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        C0465c m1396C = AbstractC0659i0.m1396C(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        long m4331c = AbstractC2710c.m4331c(c0043k1, m1396C, AbstractC0659i0.m1396C(deletionEndArea), m757G);
        if (C1602n0.m2586b(m4331c)) {
            return f1167a.m759b(AbstractC0344n.m741m(deleteRangeGesture), interfaceC3279c);
        }
        if (m757G == 1) {
            z7 = true;
        } else {
            z7 = false;
        }
        m765h(m4331c, c1587g, z7, interfaceC3279c);
        return 1;
    }

    /* renamed from: f */
    private final int m763f(AbstractC0332b0 abstractC0332b0, DeleteRangeGesture deleteRangeGesture, AbstractC0330a0 abstractC0330a0) {
        int granularity;
        RectF deletionStartArea;
        RectF deletionEndArea;
        granularity = deleteRangeGesture.getGranularity();
        m757G(granularity);
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        AbstractC0659i0.m1396C(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        AbstractC0659i0.m1396C(deletionEndArea);
        throw null;
    }

    /* renamed from: g */
    private final void m764g(AbstractC0332b0 abstractC0332b0, long j6, boolean z7) {
        if (z7) {
            throw null;
        }
        throw null;
    }

    /* renamed from: h */
    private final void m765h(long j6, C1587g c1587g, boolean z7, InterfaceC3279c interfaceC3279c) {
        int i7;
        if (z7) {
            int i8 = C1602n0.f10303c;
            int i9 = (int) (j6 >> 32);
            int i10 = (int) (j6 & 4294967295L);
            int i11 = 10;
            if (i9 > 0) {
                i7 = Character.codePointBefore(c1587g, i9);
            } else {
                i7 = 10;
            }
            if (i10 < c1587g.f10239f.length()) {
                i11 = Character.codePointAt(c1587g, i10);
            }
            if (AbstractC2710c.m4325H(i7) && (AbstractC2710c.m4324G(i11) || AbstractC2710c.m4321D(i11))) {
                do {
                    i9 -= Character.charCount(i7);
                    if (i9 == 0) {
                        break;
                    } else {
                        i7 = Character.codePointBefore(c1587g, i9);
                    }
                } while (AbstractC2710c.m4325H(i7));
                j6 = AbstractC1586f0.m2558b(i9, i10);
            } else if (AbstractC2710c.m4325H(i11) && (AbstractC2710c.m4324G(i7) || AbstractC2710c.m4321D(i7))) {
                do {
                    i10 += Character.charCount(i11);
                    if (i10 == c1587g.f10239f.length()) {
                        break;
                    } else {
                        i11 = Character.codePointAt(c1587g, i10);
                    }
                } while (AbstractC2710c.m4325H(i11));
                j6 = AbstractC1586f0.m2558b(i9, i10);
            }
        }
        int i12 = (int) (4294967295L & j6);
        interfaceC3279c.mo23f(new C0348r(new InterfaceC2443g[]{new C2458v(i12, i12), new C2440e(C1602n0.m2587c(j6), 0)}));
    }

    /* renamed from: k */
    private final int m766k(C0043k1 c0043k1, InsertGesture insertGesture, InterfaceC3679g2 interfaceC3679g2, InterfaceC3279c interfaceC3279c) {
        PointF insertionPoint;
        int i7;
        C0064p2 m120d;
        String textToInsert;
        long mo4922C;
        int m4347u;
        if (interfaceC3679g2 != null) {
            insertionPoint = insertGesture.getInsertionPoint();
            long m5797a = AbstractC3784a.m5797a(insertionPoint.x, insertionPoint.y);
            C0064p2 m120d2 = c0043k1.m120d();
            if (m120d2 != null) {
                C1605p c1605p = m120d2.f322a.f10289b;
                InterfaceC3238v m119c = c0043k1.m119c();
                if (m119c != null && (m4347u = AbstractC2710c.m4347u(c1605p, (mo4922C = m119c.mo4922C(m5797a)), interfaceC3679g2)) != -1) {
                    i7 = c1605p.m2602e(C0464b.m1005a(mo4922C, (c1605p.m2599b(m4347u) + c1605p.m2601d(m4347u)) / 2.0f, 1));
                    if (i7 == -1 && ((m120d = c0043k1.m120d()) == null || !AbstractC2710c.m4332d(m120d.f322a, i7))) {
                        textToInsert = insertGesture.getTextToInsert();
                        m768m(i7, textToInsert, interfaceC3279c);
                        return 1;
                    }
                    return m759b(AbstractC0344n.m741m(insertGesture), interfaceC3279c);
                }
            }
            i7 = -1;
            if (i7 == -1) {
            }
            return m759b(AbstractC0344n.m741m(insertGesture), interfaceC3279c);
        }
        return m759b(AbstractC0344n.m741m(insertGesture), interfaceC3279c);
    }

    /* renamed from: l */
    private final int m767l(AbstractC0332b0 abstractC0332b0, InsertGesture insertGesture, AbstractC0330a0 abstractC0330a0, InterfaceC3679g2 interfaceC3679g2) {
        PointF insertionPoint;
        insertionPoint = insertGesture.getInsertionPoint();
        AbstractC3784a.m5797a(insertionPoint.x, insertionPoint.y);
        throw null;
    }

    /* renamed from: m */
    private final void m768m(int i7, String str, InterfaceC3279c interfaceC3279c) {
        interfaceC3279c.mo23f(new C0348r(new InterfaceC2443g[]{new C2458v(i7, i7), new C2432a(str, 1)}));
    }

    /* renamed from: n */
    private final int m769n(C0043k1 c0043k1, JoinOrSplitGesture joinOrSplitGesture, C1587g c1587g, InterfaceC3679g2 interfaceC3679g2, InterfaceC3279c interfaceC3279c) {
        PointF joinOrSplitPoint;
        int i7;
        C0064p2 m120d;
        long mo4922C;
        int m4347u;
        if (interfaceC3679g2 != null) {
            joinOrSplitPoint = joinOrSplitGesture.getJoinOrSplitPoint();
            long m5797a = AbstractC3784a.m5797a(joinOrSplitPoint.x, joinOrSplitPoint.y);
            C0064p2 m120d2 = c0043k1.m120d();
            if (m120d2 != null) {
                C1605p c1605p = m120d2.f322a.f10289b;
                InterfaceC3238v m119c = c0043k1.m119c();
                if (m119c != null && (m4347u = AbstractC2710c.m4347u(c1605p, (mo4922C = m119c.mo4922C(m5797a)), interfaceC3679g2)) != -1) {
                    i7 = c1605p.m2602e(C0464b.m1005a(mo4922C, (c1605p.m2599b(m4347u) + c1605p.m2601d(m4347u)) / 2.0f, 1));
                    if (i7 == -1 && ((m120d = c0043k1.m120d()) == null || !AbstractC2710c.m4332d(m120d.f322a, i7))) {
                        int i8 = i7;
                        while (i8 > 0) {
                            int codePointBefore = Character.codePointBefore(c1587g, i8);
                            if (!AbstractC2710c.m4324G(codePointBefore)) {
                                break;
                            }
                            i8 -= Character.charCount(codePointBefore);
                        }
                        while (i7 < c1587g.f10239f.length()) {
                            int codePointAt = Character.codePointAt(c1587g, i7);
                            if (!AbstractC2710c.m4324G(codePointAt)) {
                                break;
                            }
                            i7 += Character.charCount(codePointAt);
                        }
                        long m2558b = AbstractC1586f0.m2558b(i8, i7);
                        if (C1602n0.m2586b(m2558b)) {
                            m768m((int) (m2558b >> 32), " ", interfaceC3279c);
                            return 1;
                        }
                        m765h(m2558b, c1587g, false, interfaceC3279c);
                        return 1;
                    }
                    return m759b(AbstractC0344n.m741m(joinOrSplitGesture), interfaceC3279c);
                }
            }
            i7 = -1;
            if (i7 == -1) {
            }
            return m759b(AbstractC0344n.m741m(joinOrSplitGesture), interfaceC3279c);
        }
        return m759b(AbstractC0344n.m741m(joinOrSplitGesture), interfaceC3279c);
    }

    /* renamed from: o */
    private final int m770o(AbstractC0332b0 abstractC0332b0, JoinOrSplitGesture joinOrSplitGesture, AbstractC0330a0 abstractC0330a0, InterfaceC3679g2 interfaceC3679g2) {
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x009b  */
    /* renamed from: p */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final int m771p(C0043k1 c0043k1, RemoveSpaceGesture removeSpaceGesture, C1587g c1587g, InterfaceC3679g2 interfaceC3679g2, InterfaceC3279c interfaceC3279c) {
        C1598l0 c1598l0;
        PointF startPoint;
        PointF endPoint;
        long j6;
        int i7;
        int i8;
        int i9;
        String sb;
        C0064p2 m120d = c0043k1.m120d();
        if (m120d != null) {
            c1598l0 = m120d.f322a;
        } else {
            c1598l0 = null;
        }
        startPoint = removeSpaceGesture.getStartPoint();
        long m5797a = AbstractC3784a.m5797a(startPoint.x, startPoint.y);
        endPoint = removeSpaceGesture.getEndPoint();
        long m5797a2 = AbstractC3784a.m5797a(endPoint.x, endPoint.y);
        InterfaceC3238v m119c = c0043k1.m119c();
        if (c1598l0 != null) {
            C1605p c1605p = c1598l0.f10289b;
            if (m119c != null) {
                long mo4922C = m119c.mo4922C(m5797a);
                long mo4922C2 = m119c.mo4922C(m5797a2);
                int m4347u = AbstractC2710c.m4347u(c1605p, mo4922C, interfaceC3679g2);
                int m4347u2 = AbstractC2710c.m4347u(c1605p, mo4922C2, interfaceC3679g2);
                if (m4347u == -1) {
                    if (m4347u2 == -1) {
                        j6 = C1602n0.f10302b;
                        if (C1602n0.m2586b(j6)) {
                            return f1167a.m759b(AbstractC0344n.m741m(removeSpaceGesture), interfaceC3279c);
                        }
                        String str = c1587g.subSequence(C1602n0.m2589e(j6), C1602n0.m2588d(j6)).f10239f;
                        Pattern compile = Pattern.compile("\\s+");
                        AbstractC3367j.m5099d(compile, "compile(...)");
                        AbstractC3367j.m5100e(str, "input");
                        Matcher matcher = compile.matcher(str);
                        AbstractC3367j.m5099d(matcher, "matcher(...)");
                        C0439f m2978f = AbstractC1793a0.m2978f(matcher, 0, str);
                        if (m2978f == null) {
                            sb = str.toString();
                            i8 = -1;
                            i7 = -1;
                        } else {
                            int length = str.length();
                            StringBuilder sb2 = new StringBuilder(length);
                            int i10 = 0;
                            i7 = -1;
                            while (true) {
                                sb2.append((CharSequence) str, i10, m2978f.m924b().f18163e);
                                if (i7 == -1) {
                                    i7 = m2978f.m924b().f18163e;
                                }
                                i8 = m2978f.m924b().f18164f + 1;
                                sb2.append((CharSequence) "");
                                i9 = m2978f.m924b().f18164f + 1;
                                m2978f = m2978f.m925c();
                                if (i9 >= length || m2978f == null) {
                                    break;
                                }
                                i10 = i9;
                            }
                            if (i9 < length) {
                                sb2.append((CharSequence) str, i9, length);
                            }
                            sb = sb2.toString();
                            AbstractC3367j.m5099d(sb, "toString(...)");
                        }
                        if (i7 != -1 && i8 != -1) {
                            int i11 = (int) (j6 >> 32);
                            String substring = sb.substring(i7, sb.length() - (C1602n0.m2587c(j6) - i8));
                            AbstractC3367j.m5099d(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                            interfaceC3279c.mo23f(new C0348r(new InterfaceC2443g[]{new C2458v(i11 + i7, i11 + i8), new C2432a(substring, 1)}));
                            return 1;
                        }
                        return m759b(AbstractC0344n.m741m(removeSpaceGesture), interfaceC3279c);
                    }
                } else {
                    if (m4347u2 != -1) {
                        m4347u = Math.min(m4347u, m4347u2);
                    }
                    m4347u2 = m4347u;
                }
                float m2599b = (c1605p.m2599b(m4347u2) + c1605p.m2601d(m4347u2)) / 2;
                j6 = c1605p.m2603f(new C0465c(Math.min(C0464b.m1008d(mo4922C), C0464b.m1008d(mo4922C2)), m2599b - 0.1f, Math.max(C0464b.m1008d(mo4922C), C0464b.m1008d(mo4922C2)), m2599b + 0.1f), 0, C1594j0.f10272a);
                if (C1602n0.m2586b(j6)) {
                }
            }
        }
        j6 = C1602n0.f10302b;
        if (C1602n0.m2586b(j6)) {
        }
    }

    /* renamed from: q */
    private final int m772q(AbstractC0332b0 abstractC0332b0, RemoveSpaceGesture removeSpaceGesture, AbstractC0330a0 abstractC0330a0, InterfaceC3679g2 interfaceC3679g2) {
        throw null;
    }

    /* renamed from: r */
    private final int m773r(C0043k1 c0043k1, SelectGesture selectGesture, C0622o0 c0622o0, InterfaceC3279c interfaceC3279c) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        C0465c m1396C = AbstractC0659i0.m1396C(selectionArea);
        granularity = selectGesture.getGranularity();
        long m4351y = AbstractC2710c.m4351y(c0043k1, m1396C, m757G(granularity));
        if (C1602n0.m2586b(m4351y)) {
            return f1167a.m759b(AbstractC0344n.m741m(selectGesture), interfaceC3279c);
        }
        m777v(m4351y, c0622o0, interfaceC3279c);
        return 1;
    }

    /* renamed from: s */
    private final int m774s(AbstractC0332b0 abstractC0332b0, SelectGesture selectGesture, AbstractC0330a0 abstractC0330a0) {
        RectF selectionArea;
        int granularity;
        selectionArea = selectGesture.getSelectionArea();
        AbstractC0659i0.m1396C(selectionArea);
        granularity = selectGesture.getGranularity();
        m757G(granularity);
        throw null;
    }

    /* renamed from: t */
    private final int m775t(C0043k1 c0043k1, SelectRangeGesture selectRangeGesture, C0622o0 c0622o0, InterfaceC3279c interfaceC3279c) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        C0465c m1396C = AbstractC0659i0.m1396C(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        C0465c m1396C2 = AbstractC0659i0.m1396C(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        long m4331c = AbstractC2710c.m4331c(c0043k1, m1396C, m1396C2, m757G(granularity));
        if (C1602n0.m2586b(m4331c)) {
            return f1167a.m759b(AbstractC0344n.m741m(selectRangeGesture), interfaceC3279c);
        }
        m777v(m4331c, c0622o0, interfaceC3279c);
        return 1;
    }

    /* renamed from: u */
    private final int m776u(AbstractC0332b0 abstractC0332b0, SelectRangeGesture selectRangeGesture, AbstractC0330a0 abstractC0330a0) {
        RectF selectionStartArea;
        RectF selectionEndArea;
        int granularity;
        selectionStartArea = selectRangeGesture.getSelectionStartArea();
        AbstractC0659i0.m1396C(selectionStartArea);
        selectionEndArea = selectRangeGesture.getSelectionEndArea();
        AbstractC0659i0.m1396C(selectionEndArea);
        granularity = selectRangeGesture.getGranularity();
        m757G(granularity);
        throw null;
    }

    /* renamed from: v */
    private final void m777v(long j6, C0622o0 c0622o0, InterfaceC3279c interfaceC3279c) {
        int i7 = C1602n0.f10303c;
        interfaceC3279c.mo23f(new C2458v((int) (j6 >> 32), (int) (j6 & 4294967295L)));
        if (c0622o0 != null) {
            c0622o0.m1283f(true);
        }
    }

    /* renamed from: w */
    private final void m778w(C0043k1 c0043k1, DeleteGesture deleteGesture, C0622o0 c0622o0) {
        RectF deletionArea;
        int granularity;
        if (c0622o0 != null) {
            deletionArea = deleteGesture.getDeletionArea();
            C0465c m1396C = AbstractC0659i0.m1396C(deletionArea);
            granularity = deleteGesture.getGranularity();
            long m4351y = AbstractC2710c.m4351y(c0043k1, m1396C, m757G(granularity));
            C0043k1 c0043k12 = c0622o0.f2047d;
            if (c0043k12 != null) {
                c0043k12.m121e(m4351y);
            }
            C0043k1 c0043k13 = c0622o0.f2047d;
            if (c0043k13 != null) {
                c0043k13.m122f(C1602n0.f10302b);
            }
            if (!C1602n0.m2586b(m4351y)) {
                c0622o0.m1293p(false);
                c0622o0.m1291n(EnumC0091x0.f416e);
            }
        }
    }

    /* renamed from: x */
    private final void m779x(AbstractC0332b0 abstractC0332b0, DeleteGesture deleteGesture, AbstractC0330a0 abstractC0330a0) {
        RectF deletionArea;
        int granularity;
        deletionArea = deleteGesture.getDeletionArea();
        AbstractC0659i0.m1396C(deletionArea);
        granularity = deleteGesture.getGranularity();
        m757G(granularity);
        throw null;
    }

    /* renamed from: y */
    private final void m780y(C0043k1 c0043k1, DeleteRangeGesture deleteRangeGesture, C0622o0 c0622o0) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        if (c0622o0 != null) {
            deletionStartArea = deleteRangeGesture.getDeletionStartArea();
            C0465c m1396C = AbstractC0659i0.m1396C(deletionStartArea);
            deletionEndArea = deleteRangeGesture.getDeletionEndArea();
            C0465c m1396C2 = AbstractC0659i0.m1396C(deletionEndArea);
            granularity = deleteRangeGesture.getGranularity();
            long m4331c = AbstractC2710c.m4331c(c0043k1, m1396C, m1396C2, m757G(granularity));
            C0043k1 c0043k12 = c0622o0.f2047d;
            if (c0043k12 != null) {
                c0043k12.m121e(m4331c);
            }
            C0043k1 c0043k13 = c0622o0.f2047d;
            if (c0043k13 != null) {
                c0043k13.m122f(C1602n0.f10302b);
            }
            if (!C1602n0.m2586b(m4331c)) {
                c0622o0.m1293p(false);
                c0622o0.m1291n(EnumC0091x0.f416e);
            }
        }
    }

    /* renamed from: z */
    private final void m781z(AbstractC0332b0 abstractC0332b0, DeleteRangeGesture deleteRangeGesture, AbstractC0330a0 abstractC0330a0) {
        RectF deletionStartArea;
        RectF deletionEndArea;
        int granularity;
        deletionStartArea = deleteRangeGesture.getDeletionStartArea();
        AbstractC0659i0.m1396C(deletionStartArea);
        deletionEndArea = deleteRangeGesture.getDeletionEndArea();
        AbstractC0659i0.m1396C(deletionEndArea);
        granularity = deleteRangeGesture.getGranularity();
        m757G(granularity);
        throw null;
    }

    /* renamed from: A */
    public final boolean m782A(C0043k1 c0043k1, PreviewableHandwritingGesture previewableHandwritingGesture, C0622o0 c0622o0, CancellationSignal cancellationSignal) {
        C1587g c1587g;
        C1596k0 c1596k0;
        C1587g c1587g2 = c0043k1.f220j;
        if (c1587g2 != null) {
            C0064p2 m120d = c0043k1.m120d();
            if (m120d != null && (c1596k0 = m120d.f322a.f10288a) != null) {
                c1587g = c1596k0.f10276a;
            } else {
                c1587g = null;
            }
            if (c1587g2.equals(c1587g)) {
                if (AbstractC0344n.m745q(previewableHandwritingGesture)) {
                    m753C(c0043k1, AbstractC0344n.m742n(previewableHandwritingGesture), c0622o0);
                } else if (AbstractC0339i.m718r(previewableHandwritingGesture)) {
                    m778w(c0043k1, AbstractC0339i.m707g(previewableHandwritingGesture), c0622o0);
                } else if (AbstractC0339i.m721u(previewableHandwritingGesture)) {
                    m755E(c0043k1, AbstractC0339i.m712l(previewableHandwritingGesture), c0622o0);
                } else if (AbstractC0339i.m723w(previewableHandwritingGesture)) {
                    m780y(c0043k1, AbstractC0339i.m708h(previewableHandwritingGesture), c0622o0);
                } else {
                    return false;
                }
                if (cancellationSignal != null) {
                    cancellationSignal.setOnCancelListener(new C0345o(0, c0622o0));
                    return true;
                }
                return true;
            }
            return false;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, android.os.CancellationSignal$OnCancelListener] */
    /* renamed from: B */
    public final boolean m783B(AbstractC0332b0 abstractC0332b0, PreviewableHandwritingGesture previewableHandwritingGesture, AbstractC0330a0 abstractC0330a0, CancellationSignal cancellationSignal) {
        if (AbstractC0344n.m745q(previewableHandwritingGesture)) {
            m754D(abstractC0332b0, AbstractC0344n.m742n(previewableHandwritingGesture), abstractC0330a0);
        } else if (AbstractC0339i.m718r(previewableHandwritingGesture)) {
            m779x(abstractC0332b0, AbstractC0339i.m707g(previewableHandwritingGesture), abstractC0330a0);
        } else if (AbstractC0339i.m721u(previewableHandwritingGesture)) {
            m756F(abstractC0332b0, AbstractC0339i.m712l(previewableHandwritingGesture), abstractC0330a0);
        } else if (AbstractC0339i.m723w(previewableHandwritingGesture)) {
            m781z(abstractC0332b0, AbstractC0339i.m708h(previewableHandwritingGesture), abstractC0330a0);
        } else {
            return false;
        }
        if (cancellationSignal != 0) {
            cancellationSignal.setOnCancelListener(new Object());
            return true;
        }
        return true;
    }

    /* renamed from: i */
    public final int m784i(C0043k1 c0043k1, HandwritingGesture handwritingGesture, C0622o0 c0622o0, InterfaceC3679g2 interfaceC3679g2, InterfaceC3279c interfaceC3279c) {
        C1587g c1587g;
        C1596k0 c1596k0;
        C1587g c1587g2 = c0043k1.f220j;
        if (c1587g2 != null) {
            C0064p2 m120d = c0043k1.m120d();
            if (m120d != null && (c1596k0 = m120d.f322a.f10288a) != null) {
                c1587g = c1596k0.f10276a;
            } else {
                c1587g = null;
            }
            if (!c1587g2.equals(c1587g)) {
                return 3;
            }
            if (AbstractC0344n.m745q(handwritingGesture)) {
                return m773r(c0043k1, AbstractC0344n.m742n(handwritingGesture), c0622o0, interfaceC3279c);
            }
            if (AbstractC0339i.m718r(handwritingGesture)) {
                return m760c(c0043k1, AbstractC0339i.m707g(handwritingGesture), c1587g2, interfaceC3279c);
            }
            if (AbstractC0339i.m721u(handwritingGesture)) {
                return m775t(c0043k1, AbstractC0339i.m712l(handwritingGesture), c0622o0, interfaceC3279c);
            }
            if (AbstractC0339i.m723w(handwritingGesture)) {
                return m762e(c0043k1, AbstractC0339i.m708h(handwritingGesture), c1587g2, interfaceC3279c);
            }
            if (AbstractC0339i.m699C(handwritingGesture)) {
                return m769n(c0043k1, AbstractC0339i.m710j(handwritingGesture), c1587g2, interfaceC3679g2, interfaceC3279c);
            }
            if (AbstractC0339i.m725y(handwritingGesture)) {
                return m766k(c0043k1, AbstractC0339i.m709i(handwritingGesture), interfaceC3679g2, interfaceC3279c);
            }
            if (AbstractC0339i.m697A(handwritingGesture)) {
                return m771p(c0043k1, AbstractC0339i.m711k(handwritingGesture), c1587g2, interfaceC3679g2, interfaceC3279c);
            }
            return 2;
        }
        return 3;
    }

    /* renamed from: j */
    public final int m785j(AbstractC0332b0 abstractC0332b0, HandwritingGesture handwritingGesture, AbstractC0330a0 abstractC0330a0, InterfaceC3679g2 interfaceC3679g2) {
        if (AbstractC0344n.m745q(handwritingGesture)) {
            return m774s(abstractC0332b0, AbstractC0344n.m742n(handwritingGesture), abstractC0330a0);
        }
        if (AbstractC0339i.m718r(handwritingGesture)) {
            return m761d(abstractC0332b0, AbstractC0339i.m707g(handwritingGesture), abstractC0330a0);
        }
        if (AbstractC0339i.m721u(handwritingGesture)) {
            return m776u(abstractC0332b0, AbstractC0339i.m712l(handwritingGesture), abstractC0330a0);
        }
        if (AbstractC0339i.m723w(handwritingGesture)) {
            return m763f(abstractC0332b0, AbstractC0339i.m708h(handwritingGesture), abstractC0330a0);
        }
        if (AbstractC0339i.m699C(handwritingGesture)) {
            return m770o(abstractC0332b0, AbstractC0339i.m710j(handwritingGesture), abstractC0330a0, interfaceC3679g2);
        }
        if (AbstractC0339i.m725y(handwritingGesture)) {
            return m767l(abstractC0332b0, AbstractC0339i.m709i(handwritingGesture), abstractC0330a0, interfaceC3679g2);
        }
        if (AbstractC0339i.m697A(handwritingGesture)) {
            return m772q(abstractC0332b0, AbstractC0339i.m711k(handwritingGesture), abstractC0330a0, interfaceC3679g2);
        }
        return 2;
    }
}
