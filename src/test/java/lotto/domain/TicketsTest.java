package lotto.domain;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Map;
import org.junit.jupiter.api.Test;

public class TicketsTest {

        public Ticket newTicket(int[] numbers) {
                return new Ticket(new LottoNumbers(numbers));
        }

        @Test
        void 보너스_번호_포함_당첨_티켓_갯수() {
                long purchaseAmount = 3_000;
                WinningNumbers winningNumbers = new WinningNumbers(List.of(1, 2, 3, 4, 5, 6));
                Ticket ticket1 = newTicket(new int[]{1, 2, 3, 7, 8, 9});
                Ticket ticket2 = newTicket(new int[]{10, 11, 12, 13, 14, 15});
                Ticket ticket3 = newTicket(new int[]{1, 2, 3, 10, 11, 12});
                winningNumbers.addBonusNumberInToTheWinningNumbers(10);
                Tickets tickets = new Tickets(List.of(ticket1, ticket2, ticket3));

                assertThat(tickets.countWinningTickets(winningNumbers).toString()).isEqualTo(
                    "{FIRST=0, SECOND=0, THIRD=0, FOURTH=1, FIFTH=1, MISS=1}");
        }

        @Test
        void 보너스_번호_포함_로또_결과_수익률_계산() {
                long purchaseAmount = 3_000;
                WinningNumbers winningNumbers = new WinningNumbers(List.of(1, 2, 3, 4, 5, 6));
                Ticket ticket1 = newTicket(new int[]{1, 2, 3, 7, 8, 9});
                Ticket ticket2 = newTicket(new int[]{10, 11, 12, 13, 14, 15});
                Ticket ticket3 = newTicket(new int[]{1, 2, 3, 10, 11, 12});
                Tickets tickets = new Tickets(List.of(ticket1, ticket2, ticket3));
                winningNumbers.addBonusNumberInToTheWinningNumbers(10);
                Map<Rank, Integer> matchRankCountMap = tickets.countWinningTickets(winningNumbers);

                assertThat(tickets.calculateRateOfBenefit(matchRankCountMap, purchaseAmount)).isEqualTo(18.33);
        }
}
