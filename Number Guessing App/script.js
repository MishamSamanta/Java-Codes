let secretNumber = Math.floor(Math.random() * 100) + 1;
let attempts = 0;
const maxAttempts = 7;

const hintBox = document.getElementById('hint');
const attemptCount = document.getElementById('attempt-count');
const progress = document.getElementById('progress');
const guessBtn = document.getElementById('guess-btn');
const input = document.getElementById('guess-input');
const historyList = document.getElementById('history-list');

input.addEventListener('keydown', function(e) {
  if (e.key === 'Enter') makeGuess();
});

function addToHistory(guess, status) {
  // Remove empty state message if present
  const empty = historyList.querySelector('.empty-state');
  if (empty) empty.remove();

  const row = document.createElement('div');
  row.className = 'history-row';

  let badgeClass = '';
  let badgeText = '';
  let icon = '';

  if (status === 'low')  { badgeClass = 'low';  badgeText = 'Too Low';  icon = '📈'; }
  if (status === 'high') { badgeClass = 'high'; badgeText = 'Too High'; icon = '📉'; }
  if (status === 'win')  { badgeClass = 'win';  badgeText = 'Correct!'; icon = '🎯'; }

  row.innerHTML = `
    <div class="row-left">
      <span class="attempt-num">#${attempts}</span>
      <span class="guess-number">${icon} ${guess}</span>
    </div>
    <span class="status-badge ${badgeClass}">${badgeText}</span>
  `;

  historyList.prepend(row); // newest on top
}

function makeGuess() {
  const guess = parseInt(input.value);

  if (isNaN(guess) || guess < 1 || guess > 100) {
    hintBox.className = 'hint-box';
    hintBox.textContent = '⚠️ Please enter a valid number between 1 and 100.';
    return;
  }

  attempts++;
  attemptCount.textContent = attempts;
  progress.style.width = (attempts / maxAttempts * 100) + '%';
  input.value = '';

  if (guess === secretNumber) {
    hintBox.className = 'hint-box win';
    hintBox.textContent = '🎉 Correct! The number was ' + secretNumber + '. You got it in ' + attempts + (attempts > 1 ? ' attempts!' : ' attempt!');
    addToHistory(guess, 'win');
    guessBtn.disabled = true;
    input.disabled = true;

  } else if (attempts >= maxAttempts) {
    hintBox.className = 'hint-box lose';
    hintBox.textContent = '😔 Out of attempts! The number was ' + secretNumber + '. Better luck next time!';
    addToHistory(guess, guess < secretNumber ? 'low' : 'high');
    guessBtn.disabled = true;
    input.disabled = true;

  } else if (guess < secretNumber) {
    hintBox.className = 'hint-box low';
    hintBox.textContent = '📈 Too low! Try going higher. (' + (maxAttempts - attempts) + ' attempts left)';
    addToHistory(guess, 'low');

  } else {
    hintBox.className = 'hint-box high';
    hintBox.textContent = '📉 Too high! Try going lower. (' + (maxAttempts - attempts) + ' attempts left)';
    addToHistory(guess, 'high');
  }

  input.focus();
}

function restartGame() {
  secretNumber = Math.floor(Math.random() * 100) + 1;
  attempts = 0;
  attemptCount.textContent = 0;
  progress.style.width = '0%';
  hintBox.className = 'hint-box';
  hintBox.textContent = 'Make your first guess!';
  guessBtn.disabled = false;
  input.disabled = false;
  input.value = '';
  historyList.innerHTML = '<div class="empty-state">No guesses yet. Start playing!</div>';
  input.focus();
}